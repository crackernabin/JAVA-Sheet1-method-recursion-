
import java.util.Scanner;

public class factorial {
    static long fact(int n) {
        if(n==0 || n==1){
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n>=0 && n<=20){
     System.out.println("factorial number is"+fact(n));
        }else{
            System.out.println("number is invalid");
        }
        sc.close();
    }
}

