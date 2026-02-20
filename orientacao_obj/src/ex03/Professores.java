package ex03;

public class Professores {
    // atributos ou variáveis de instância
    String nome;
    int totalDeAulas;
    double valorDaAula;

    public double salarioBase() {
        return totalDeAulas * 4.5 * valorDaAula;
    }

    public double adicionalHoraAtividade() {
        return salarioBase() * 5 / 100;
    }

    public double descansoSemanal() {
        return (salarioBase() + adicionalHoraAtividade()) / 6;
    }

    public double calcularSalarioBruto() {
        return salarioBase() + adicionalHoraAtividade() + descansoSemanal();
    }
}