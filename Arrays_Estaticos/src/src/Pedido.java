import java.util.Random;

public class Pedido {
    int numero;
    String data;
    Item_Pedido[] item;
    int index;

    public Pedido(String data, int totalItens) {
        Random random = new Random();
        this.numero = random.nextInt(1000,9999);
        this.data = data;
        this.item = new Item_Pedido[totalItens];
    }

    public void AddItem(Item_Pedido itemPedido){
        if (index <  item.length)
            item[index]  = itemPedido;
        index++;
    }

    public double valorTotal(){
        double total = 0;
        for (int i = 0; i < index; i++){
            total+= item[i].totalParcial();
        }
        return total;
    }
}
