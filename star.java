import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        System.out.println("Test Case 1 Output (n=" + n1 + "):");
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}