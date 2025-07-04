import java.util.Scanner;
class Alphabeticalorder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char first = sc.next().charAt(0);
        char second= sc.next().charAt(0);
        char temp;
        if(first<second){
            System.out.print(first + "," + second);

        }
        else if (second<first){
            temp=first;
            first = second;
            second = temp;
            System.out.print(first + "," + second);
        } 
    }
}