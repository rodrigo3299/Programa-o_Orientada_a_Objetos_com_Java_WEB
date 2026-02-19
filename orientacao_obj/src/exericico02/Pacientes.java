package exericico02;

public class Pacientes {
    String nome;
    int idade;

    public int calcFreqCardMax(){
        return 220 - idade;
    }
    public double[] FreqAlvo(){
        double[] alvo = new double[2];
        int frequencia = calcFreqCardMax();
        alvo[0] = frequencia * 0.5;
        alvo[1] = frequencia * 0.85;
        return alvo;
    }

}


