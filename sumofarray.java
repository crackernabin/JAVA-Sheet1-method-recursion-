
import java.util.Scanner;

public class sumofarray {
    static int sumofelements(int num){
        if(num==0)
            return 0;
        return(num%10)+sumofelements(num/10);
    }
    static int sumof(int[] arr,int index){
        if(index==arr.length)
            return 0;
        return sumofelements(arr[index])+sumof(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int result=sumof(arr,0);
        System.out.println("sum of all elements ="+sumof(arr,0));
    }
}
