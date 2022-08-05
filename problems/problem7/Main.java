import java.util.*;
import java.io.*;

class students implements Comparable<students>{
    int roll;
    String firstname;
    String lastname;
    public students(int roll,String firstname,String lastname){
        this.roll = roll;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int compareTo(students s){
        if(roll>s.roll)
            return 1;
        else if(roll<s.roll)
            return -1;
        else
            return 0;
        
    }   
}

public class Main
{
	public static void main(String[] args) {
		TreeSet<students>ts=new TreeSet<students>();
		ts.add(new students(6,"pavan","k"));
		ts.add(new students(3,"kalyan","p"));
		ts.add(new students(8,"akhil","s"));
		ts.add(new students(1,"ram","m"));
		try{
            FileWriter writer = new FileWriter("output.txt");
		for(students s:ts){
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
