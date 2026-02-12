import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.printf("Digite o valor de n : ");
        n = sc.nextInt();
        while (true) {
            System.out.print( n + " ");
            if (n == 1) break;
            if(n % 2 == 1){
                n = 3 * n + 1;
            }
            else {
                n = n / 2;
            }
        }
    }
}
