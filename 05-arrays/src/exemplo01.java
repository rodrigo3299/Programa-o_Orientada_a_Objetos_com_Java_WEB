public class exemplo01 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        double[] y = {0.5,1.5,3.0};
        String[] z = {"a", "b", "c"};

        imprimir(x);
        imprimir(y);
        imprimir(z);


    }

    public static void imprimir(double[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    public static void imprimir(int[] v){
        for (int i : v){
            System.out.print(i + " ");
        }
    }
    public static void imprimir(String[] v){
        for (String i : v) {
            System.out.print(i + " ");
        }
    }

}
