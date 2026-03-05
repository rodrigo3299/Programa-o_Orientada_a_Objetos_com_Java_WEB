package ex04;

public class Carro {
    String placa;
    String modelo;
    static int contador = 0;

    public Carro(String placa, String modelo){
        this.modelo = modelo;
        this.placa = placa;
        contador++;
    }

    public static int getTotal(){
        return contador;
    }

}

