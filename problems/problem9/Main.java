import java.util.*;
import java.lang.*;
import java.io.*;
import Log.Log;

public class Main {
    public static void main(String args[]){
        Thread mythread[] = new Thread[1000];
        LinkedList<students> ll = new LinkedList<students>();
        Log logg  = new Log("problem9");
        try {
            Scanner sc = new Scanner(new File("data\\sheet.csv"));
            sc.useDelimiter(", ");
            String[] data;
            int i=0;
            while(sc.hasNext()){
                i=i+1;
                data = sc.nextLine().split(",");
                ll.add(new students(data[0],data[1],data[2]));
            }
            int count=1;
            int ind = 0;
            int lengthofll = ll.size();
            while(count<lengthofll){
                mythread[ind] = new Thread(new calculate(ll.subList(count, count+2)));
                count+=2; //choose how much data need to be split(now it is 2 per thread)
                ind++;
            }
            for(int index=0;index<ind;index++){
                mythread[index].start();
            }
            System.out.println("Data has been processed");
            logg.logger.info("Threading completed");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logg.logger.warning("File Not Found");
        }
    }
}