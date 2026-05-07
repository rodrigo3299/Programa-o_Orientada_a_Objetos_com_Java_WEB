package br.techgeo.main;

import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.forma.Forma;
import br.techgeo.forma.Volume;
import br.techgeo.ponto.Ponto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(new Ponto(2,2),2));
        lista.add(new Cilindro(new Ponto(0,0), 3,4));
        lista.add(new Circulo(new Ponto(2,2),2));
        lista.add(new Cilindro(new Ponto(0,0), 3,4));


        for (Forma forma : lista){
            System.out.println(forma);
            System.out.println(forma.calcularArea());
            if (forma instanceof Volume){
                System.out.println(((Volume)forma).calcularVolume());
            }
            System.out.println();
        }
    }
}
