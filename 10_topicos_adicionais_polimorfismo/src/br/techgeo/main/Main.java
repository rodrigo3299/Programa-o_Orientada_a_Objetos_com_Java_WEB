package br.techgeo.main;

import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.ponto.Ponto;

public class Main {
    public static void main(String[] args) {
        Ponto ponto;

        //objeto circulo
        ponto = new Ponto(0,0);
        Circulo circulo = new Circulo(ponto,5);

        //objeto cilindro
        ponto = new Ponto(2, -3);
        Cilindro cilindro = new Cilindro(ponto, 8, 2);

        System.out.println("Circulo");
        System.out.println(circulo);
        System.out.println("Área = " + circulo.calcularArea());

        System.out.println("\nCilindro");
        System.out.println(cilindro);
        System.out.println("Área = " + cilindro.calcularArea());
        System.out.println("Volume = " + cilindro.calcularVolume());
    }
}
