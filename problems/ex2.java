import java.lang.*;

class Numbers{
    private double d;
    public Numbers(double value){
        d=value;
    }
    public boolean isZero(){
        if(d==0.0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPositive(){
        if(d > 0.0)
            return true;
        else
            return false;
    }
    public boolean isNegative(){
        if (d < 0.0)
            return true ;
        else
            return false;
    }
    public boolean isodd(){
        if (d % 2 != 0.0)
            return true;
        else 
            return false;
    }
    public boolean isEven(){
        if (d % 2 == 0.0)
            return true ;
        else 
            return false;
    }
    
    public double getFactorial(){
        double temp=1.0;
        for(double i=2;i<=d;i++){
            temp = temp*i;
        }
        return temp;
    }
    public double getSqr(){
        return d*d;
    }
    public double getSqrt(){
        return Math.sqrt(d);
    }
    public double sumDigits(){
        long l = (long)d;
		long rev=0;
		while(l>0){
		    long r  = l%10;
		    rev = rev+r;
		    l=l/10;
		}
		double t = d-(long)d;
	    return rev+t;
    }
    public double getReverse(){
        long l = (long)d;
		long rev=0;
		while(l>0){
		    long r  = l%10;
		    rev = (rev*10)+r;
		    l=l/10;
		}
		double t = d-(long)d;
	    return rev+t;
        
    }
    
    public void listFact(){
        long l = (long)d;
        for(long i=1;i<=l;i++){
            if(l%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public void dispBinary(){
        System.out.println(Long.toBinaryString((long)d));
    }
}
public class Main
{
	public static void main(String[] args) {
		Numbers numbers = new Numbers(7.0);
		System.out.println(numbers.getReverse());
		numbers.dispBinary();
	}
}
