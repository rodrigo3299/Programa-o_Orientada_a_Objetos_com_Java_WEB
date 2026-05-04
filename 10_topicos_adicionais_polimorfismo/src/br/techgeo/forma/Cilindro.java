package br.techgeo.forma;

import br.techgeo.ponto.Ponto;

public class Cilindro {
    private Ponto ponto;
    private double raio;
    private double altura;

    public Cilindro(Ponto ponto, double raio, double altura) {
        this.ponto = ponto;
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = 2 * Math.PI * raio * ( raio + altura);
        return area;
    }

    public double calcularVolume(){
        double volume = Math.PI * raio * raio * altura;
        return volume;
    }

    @Override
    public String toString() {
        String aux = ponto.toString() + "\n";
        aux +="Raio: " + String.format("%.2f" , raio) + "\n";
        aux +="Altura: " + String.format("%.2f" , altura);
        return aux;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
