public class Main {
    public static void main(String[] args) {
        Item_Pedido item1 = new  Item_Pedido("mouse", 50, 3);
        Item_Pedido item2 = new  Item_Pedido("teclado", 1000, 2);
        Item_Pedido item3 = new  Item_Pedido("tablet", 100, 5);

    //gerando dois pedidos

        Pedido pedido1 = new Pedido("16/03/2026", 2);
        pedido1.AddItem(item1);
        pedido1.AddItem(item2); //dois pedidos pq são dois itens

        Pedido pedido2 = new Pedido("26/04/2026", 1);
        pedido2.AddItem(item3); //um pedido pq são um itens


        //gerando cliente
        Cliente cliente = new Cliente("Rodrigo", 2334, 2);
        cliente.addPedido(pedido1);
        cliente.addPedido(pedido2);

        System.out.println("total de todos os pedidos R$" +cliente.total());
    }
}
