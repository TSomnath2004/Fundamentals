import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second =sc.nextInt();
        for(int i = first ;i<=second;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
    }
}