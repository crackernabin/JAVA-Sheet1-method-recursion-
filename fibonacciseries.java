
import java.util.Scanner;

public class fibonacciseries {
    static int  fib(int n){
        if(n==0)
return 0;
        if(n==1)
        return 1;
    return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println("enter the number 0-30:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       if(n>=0 && n<=30){
System.out.println("fabonacci number is"+fib(n));

sc.close();
       }
    }
}
