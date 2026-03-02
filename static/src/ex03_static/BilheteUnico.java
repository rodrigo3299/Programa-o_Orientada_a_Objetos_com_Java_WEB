package ex03_static;

import java.util.Random;

public class BilheteUnico {
    int numero;
    String usuario;
    double saldo;
    final static double tarifaBase = 5.40;
    String tipoTarifa;

    public BilheteUnico( String usuario, String tipoTarifa){
        Random rd = new Random();
        this.numero = rd.nextInt(1000,9999);
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
    }
}
