package ex03;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];  //criação do vetor

        produtos[0] = new Produto("camiseta", 100, 50);
        produtos[1] = new Produto("calça", 70, 20);
        produtos[2] = new Produto("tênis", 30, 200);

        imprimir(produtos);
       imprimirValorTotalEstoque(produtos);
    }
    public static void imprimir(Produto[] produtos){
        for(Produto p : produtos){
            System.out.println(p.nome);
            System.out.println(p.quantidade);
            System.out.println(p.valor);
            System.out.println();
        }
    }

    public static void imprimirValorTotalEstoque(Produto[] produtos){
            double aux = 0 ;
            for (Produto p : produtos){
                aux += p.quantidade * p.valor;
            }
        System.out.println("Valor total do estoque é de " +aux);
    }
}


