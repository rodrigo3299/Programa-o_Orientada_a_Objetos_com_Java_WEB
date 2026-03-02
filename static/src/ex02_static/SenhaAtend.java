package ex02_static;

public class SenhaAtend {
    static int controle = 0;
    int senha;
    String paciente;

    public SenhaAtend(String paciente) {
        this.paciente = paciente;
        controle++;
        this.senha = controle;
    }

    public String getDados(){
        return "Senha # " + senha + "| Paciente : " +paciente;
    }
}
