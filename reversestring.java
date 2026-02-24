
import java.util.Scanner;

public class reversestring {
    static String rev(String str)
    {
    if(str.isEmpty())
        return str;
    return rev(str.substring(1))+str.charAt(0);
}
public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter the string:");
    String str=ss.nextLine();
    System.out.println("reverse string"+rev(str));

}
}

