public class Item_Pedido {
    String produto;
    double valor;
    int qtdComprada;

    public Item_Pedido(String produto, double valor, int qtdComprada) {
        this.produto = produto;
        this.valor = valor;
        this.qtdComprada = qtdComprada;
    }

    public double totalParcial(){
        return valor * qtdComprada;

    }
}
