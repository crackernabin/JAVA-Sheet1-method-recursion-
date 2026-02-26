public class countwaysclimbstair {
    static int countways(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 2;
        return countways(n-1)+countways(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("total ways:"+countways(n));
    }
}
