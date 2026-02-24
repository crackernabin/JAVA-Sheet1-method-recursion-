
import java.util.Scanner;

public class pallindrome {
    static int reverse(int num,int rev){
      if(num==0)
        return rev;
    return reverse(num/10,rev*10+num%10);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter ther number");
int num=sc.nextInt();
    int pallindrome=reverse(num,0);
    if(num==pallindrome){
    System.out.println("the pallindrome number is:"+pallindrome);
    }else{
        System.out.println("not a pallindrome number");
    }
    }
}
