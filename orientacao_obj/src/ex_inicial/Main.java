package ex_inicial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno1 alun = new Aluno1();
        Scanner sc = new Scanner(System.in);
        double media;
        System.out.println("Digite seu RM : ");
        alun.rm = sc.nextInt();

        System.out.println("Digite seu nome :");
        alun.nome = sc.next();

        System.out.println("Digite seu curso : ");
        alun.curso = sc.next();

        System.out.println("Digite a sua nota1 : ");
        alun.nota1 = sc.nextDouble();

        System.out.println("Digite a sua nota2: ");
        alun.nota2 = sc.nextDouble();

        media = alun.calcMedia();
        System.out.println("Media = " + media);

        System.out.println(alun.Situacao());
    }
}
