
import java.util.*;

class Main{
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
    public static void main (String args[]){
        int n = 5;
        int a[] = {1, 5,-2,3};
		System.out.println(findMaxRec(a, 4));
        System.out.println(fib(n));
    }
}
