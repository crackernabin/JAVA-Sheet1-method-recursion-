import java.util.Scanner;

public class printallsequencestring {
    static void Stringstr(String str,String ans){
if(str.length()==0){
    System.out.println(ans);
    return;
}
Stringstr(str.substring(1),ans+str.charAt(0));
Stringstr(str.substring(1),ans);
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
System.out.println("Enter thee string");
String str=sc.nextLine();
Stringstr(str,"");
    }
}
