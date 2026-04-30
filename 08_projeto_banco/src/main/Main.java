package main;

import conta.Conta;
import corrente.ContaCorrente;
import poupanca.ContaPoupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<>();
        list.add(new ContaCorrente(43,5000,10000));
        list.add(new ContaPoupanca(2,5000,5));


        for (Conta conta : list){
            conta.depositar(1000);
            System.out.println(conta);
            System.out.println(conta.getSaldoDisponivel());
            System.out.println();
        }

        for(Conta conta : list){
            if(conta instanceof ContaPoupanca);
            ((ContaPoupanca) conta).aplicarRendimento();
        }
    }
}
