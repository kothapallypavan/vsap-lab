import java.io.*;
import java.lang.*;
import java.util.*;
public class calculate extends Thread{
    public List<students>finalList;
    public calculate(List<students> l){
        finalList = l;
    }
    @Override
    synchronized public void run() {
        try {
            FileOutputStream file = new FileOutputStream("result.txt", true);
            PrintWriter writer = new PrintWriter(file);
            for (students student : finalList) {
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
