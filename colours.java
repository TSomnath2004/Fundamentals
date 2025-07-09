import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        char name = Character.toLowerCase(sc.next().charAt(0));
        switch (name){
            case 'g' :
                System.out.print("green");
                break;
            case 'o':
                System.out.print("Orange");
                break;
            case 'b':
                System.out.print("blue");
                break;
            default:
               System.out.print("invalid code");
               
        }
    }
}