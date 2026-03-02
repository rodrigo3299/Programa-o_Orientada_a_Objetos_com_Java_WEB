package ex02_static;

public class Main {
    public static void main(String[] args) {
        SenhaAtend senha1 = new SenhaAtend("Rodrigo");
        SenhaAtend senha2 = new SenhaAtend("Fabio");
        SenhaAtend senha3 = new SenhaAtend("Maria");
        System.out.println(senha1.getDados());
        System.out.println(senha2.getDados());
        System.out.println(senha3.getDados());


    }
}
