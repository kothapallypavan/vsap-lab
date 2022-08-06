import java.util.*;

public class problem8
{
    static Double addition(ArrayList<?extends Number>list){
        double s=0.0;
        for(Number n:list){
            s+=n.doubleValue();
        }
        return s;
    }

    static void addsum(ArrayList<?super Integer>list){
        for(Object n:list){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        //upper bounded
        ArrayList<Integer>al = new ArrayList<Integer>();
        al.add(20);
        al.add(40);
        al.add(60);
        System.out.println("Integer sum in double : "+addition(al));
        ArrayList<Double>dl = new ArrayList<Double>();
        dl.add(20.0);
        dl.add(10.0);
        System.out.println("Double sum :"+addition(dl));
        System.out.println();
        //lower bounded		
        ArrayList<Number>lb = new ArrayList<Number>();
        lb.add(10.0);
        lb.add(20.0);
        addsum(lb);
    }
}