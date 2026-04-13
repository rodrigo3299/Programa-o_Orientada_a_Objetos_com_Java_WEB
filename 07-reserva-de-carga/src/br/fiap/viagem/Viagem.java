package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {
    private int capacidade;
    private int index;
    private Carga[] carga;

    public Viagem(){
        this.capacidade = 10000;
        this.index = 0;
        this.carga = new Carga[20];
    }

    public boolean permitidoReservar(double peso){
        double total = capacidadeReservada();
        return (total + peso ) <= capacidade;
    }

    public boolean reservar(Carga carga){
        if(permitidoReservar(carga.getPeso())){
            this.carga[index++] = carga;
            return true;
        }
        return false;
    }

    public double capacidadeReservada(){
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += carga[i].getPeso();
        }
        return total;
    }

    public String getDados(){
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += carga[i].getDados();
        }
        return aux;
    }

    //metodo para pesquisar uma carga pelo CNPJ
    public Carga pesquisar(int cnpj){
        int posicao = buscarPorIndice(cnpj);
        if(posicao != -1){
            return carga[posicao];
        }
        return null;
    }

    private int buscarPorIndice(int cnpj){
        for (int i = 0; i < index; i++) {
            if(carga[i].getCliente().getCnpj() == cnpj) {
                return i;
            }
        }
        return -1;
    }

    public boolean cancelar(int cnpj){
        int posicao = buscarPorIndice(cnpj);
        if (posicao == -1) {
            return false;
        }
        carga[posicao] = carga[index -1];
        index--;
        return true;
    }
}
