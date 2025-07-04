import java.util.Scanner;
class Chechalpaordig{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0); 
        
        if(ch>='A'&&ch<='Z'||ch>'a'&&ch<'z'){
            System.out.print("alphabet");
        }
        else if (ch>='0'&&ch<='9'){
            System.out.print("digits");
        }
        else{
            System.out.print("Special Character");
        }
    }
}