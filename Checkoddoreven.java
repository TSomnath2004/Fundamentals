import java.util.Scanner;
class Checkoddoreven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print("even number");
        }else{
            System.out.print("odd");
        }
    }
}