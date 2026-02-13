package ex01;

public class Conta {
    //atributos
    int numero;
    double saldo;
    String correntista;

    //metodo para despositar um valor
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //metodo para sacar um valor
    public void sacar(double valor){
        saldo = saldo - valor;
    }
}

