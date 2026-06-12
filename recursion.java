public class recursion {
    public static void rec(int i,int n, int factorial){
        if(i==n){
            factorial*=i;
            System.out.println(factorial);
            return;
        }
        factorial*=i;
        rec(i+1,n,factorial);
    }
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int i = 1;
        rec(i,n,factorial);
    }
}
