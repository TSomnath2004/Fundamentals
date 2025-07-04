import java.util.Scanner;
class checkposorneg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.print("positive number");
        }
        else if(num<0){
            System.out.print("negative number");
        }
        else if (num==0){
            System.out.print("zero");
        }
    }
}