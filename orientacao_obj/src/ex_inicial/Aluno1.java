package ex_inicial;

public class Aluno1 {
    //atributos ou propriedades ou variáveis de instância = objeto
    int rm;
    double nota1;
    double nota2;
    String nome;
    String curso;

    public double calcMedia(){
        double media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public String Situacao(){
        if(calcMedia() >= 6){
            return "Aprovado";
        }
        return "Reprovado";

    }
}
