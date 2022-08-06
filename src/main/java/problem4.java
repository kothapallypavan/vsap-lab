import java.util.*;
class fibandmax{
    public static int findMaxRec(int a[], int n){
        if(n == 1)
            return a[0];
        return Math.max(a[n-1], findMaxRec(a, n-1));
    }
    public static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
public class problem4{

    public static void main (String args[]){
        int n = 5;
        int a[] = {1, 5,-2,3};
        fibandmax f = new fibandmax();
        System.out.println(f.findMaxRec(a, 4));
        System.out.println(f.fib(n));
    }
}