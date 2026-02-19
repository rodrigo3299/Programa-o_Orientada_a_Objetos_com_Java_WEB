package exericico02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Pacientes paci = new Pacientes();
        Scanner sc = new Scanner(System.in);
        int calcFreqCardMax;
        double[] alvo;
        System.out.println("Digite seu nome : ");
        paci.nome = sc.next();
        System.out.println("Digite sua idade : ");
        paci.idade = sc.nextInt();

        calcFreqCardMax = paci.calcFreqCardMax();
        alvo = paci.FreqAlvo();

        System.out.println("Frequência Max : " +calcFreqCardMax);
        System.out.println("Alvo inicial : " +df.format(alvo[0]));
        System.out.println("Alvo final : " +df.format(alvo[1]));







    }

}
