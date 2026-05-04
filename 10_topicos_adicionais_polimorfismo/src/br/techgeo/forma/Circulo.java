package br.techgeo.forma;

import br.techgeo.ponto.Ponto;

public class Circulo {
    private Ponto ponto;
    private double raio;

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public double calcularArea(){
        double area = Math.PI * raio * raio;
        return area;
    }

    @Override
    public String toString() {
        String aux = ponto.toString() + "\n";
        aux += "Raio " + String.format("%.2f", raio);
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
}
