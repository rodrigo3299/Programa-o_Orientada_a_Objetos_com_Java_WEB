package br.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu(){
        int opcao;
        do{
            String aux = "Reserva de Cargas\n";
            aux += "[1] Reservar\n";
            aux += "[2] Pesquisar\n";
            aux += "[3] Visualizar reservas\n";
            aux += "[4] Capacidade reservada\n";
            aux += "[5] Cancelar reserva\n";
            aux += "[6] Finalizar\n";
            opcao = parseInt(showInputDialog(aux));
            if (opcao < 1 || opcao > 6){
                showMessageDialog(null, "Opção invalida");
            }
            else {
                switch(opcao){
                    case 1 -> reservar();
                    
                }
            }
        } while (opcao != 6);
    }

    private void reservar() {

    }
}
