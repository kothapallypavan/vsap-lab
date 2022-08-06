import java.util.*;
import java.lang.*;
import java.io.*;
import Log.Log;
class studentst{
    String id;
    String name;
    String eng;
    public studentst(String id,String name,String eng){
        this.id= id;
        this.name=name;
        this.eng=eng;
    }
}


class calculate extends Thread{
    public List<studentst>finalList;
    public calculate(List<studentst> l){
        finalList = l;
    }
    @Override
    synchronized public void run() {
        try {
            FileOutputStream file = new FileOutputStream("result.txt", true);
            PrintWriter writer = new PrintWriter(file);
            for (studentst student : finalList) {
                int marks = Integer.parseInt(student.eng);
                if (marks > 90) {
                    writer.println(student.name + " : Distinction");
                } else if ( marks > 37) {
                    writer.println(student.name + " : Passed");
                } else {
                    writer.println(student.name + " : Not Cleared");
                }
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


public class problem9 {
    public static void main(String args[]) throws IOException {
        Thread mythread[] = new Thread[1000];
        LinkedList<studentst> ll = new LinkedList<studentst>();
        Log logg  = new Log("problem9");
        try {
            Scanner sc = new Scanner(new File("./data/sheet.csv"));
            sc.useDelimiter(", ");
            String[] data;
            int i=0;
            while(sc.hasNext()){
                i=i+1;
                data = sc.nextLine().split(",");
                ll.add(new studentst(data[0],data[1],data[2]));
            }
            int count=1;
            int ind = 0;
            System.out.println(ll.size());
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