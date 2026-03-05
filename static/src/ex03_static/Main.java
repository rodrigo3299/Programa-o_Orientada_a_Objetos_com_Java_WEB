import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, tipoTarifa;

        System.out.print("Usúario do bilhete único --> ");
        usuario = sc.next();
        System.out.print("Digite o tipo de tarifa: Professor, Estudante ou Normal --> ");
        tipoTarifa = sc.next();

        BilheteUnico bilhete = new BilheteUnico(usuario, tipoTarifa);


        System.out.println("Saldo atual R$ " + bilhete.saldo);
        bilhete.passarNaCatraca();
        System.out.println("Saldo atual R$ " +bilhete.saldo);
        bilhete.Carregar(10);
        bilhete.passarNaCatraca();
        System.out.println("Saldo atual R$ " +bilhete.saldo);
    }
}
