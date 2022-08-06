import java.util.*;
import java.io.*;

class student implements Comparable<student>{
    int roll;
    String firstname;
    String lastname;
    public student(int roll,String firstname,String lastname){
        this.roll = roll;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int compareTo(student s){
        if(roll>s.roll)
            return 1;
        else if(roll<s.roll)
            return -1;
        else
            return 0;

    }
}

public class problem7
{
    public static void main(String[] args) {
        TreeSet<student>ts=new TreeSet<student>();
        ts.add(new student(6,"pavan","k"));
        ts.add(new student(3,"kalyan","p"));
        ts.add(new student(8,"akhil","s"));
        ts.add(new student(1,"ram","m"));
        try{
            FileWriter writer = new FileWriter("output.txt");
            for(student s:ts){
                System.out.println(s.roll+" "+s.firstname+" "+s.lastname);
                writer.write(s.roll+" "+s.firstname+" "+s.lastname+"\n");
            }
            writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

    }
}