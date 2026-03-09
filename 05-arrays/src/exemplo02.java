public class exemplo02 {
    public static void main(String[] args) {
        System.out.println(somar(2, 3));
        System.out.println(somar(2, 3, 5));
        System.out.println(somar(1, 2, 3, 4, 5, 6));
    }

    public static int somar(int ...v){
            int aux = 0;
            for( int i : v){
                aux += i;
            }
            return aux;
    }


}
