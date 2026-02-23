
import java.util.Scanner;

public class sumofdigit {
    static int sum (int n){
        if(n==0)
            return 0;
          return (n%10) + sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println("enter your digit:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("sum of number is:"+sum(num));
    }
}
