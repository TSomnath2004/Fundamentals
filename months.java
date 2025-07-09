import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        switch (num){
            case 1:
            System.out.print("january");
            break;
            case 2:
            System.out.print("february");
            break;
            case 3:
            System.out.print("march");
            break;
            case 4:
            System.out.print("april");
            break;
            case 5:
            System.out.print("may");
            break;
            default :
            System.out.print("invalid month");
            
        }
       
    }
}