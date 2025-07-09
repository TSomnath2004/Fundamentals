import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //int f=sc.nextInt();
       // int s=sc.nextInt();
        
        for(int i = 2;i<=100;i++){
            int count=0;
            for(int j=2;j<=100;j++){
                
                if(i%j==0){
                    count++;
                }
            
            }
            if(count==1){
                System.out.print(i+" ");
            }
            
        }
    }
}