import java.util.*;
import java.io.*;

class students{
    int roll;
    String firstname;
    String lastname;
    public students(int roll,String firstname,String lastname){
        this.roll = roll;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
public class Main
{
	public static void main(String[] args) {
		List<students>s1 = new ArrayList<students>();
		s1.add(new students(1,"pavan","kalyan"));
		s1.add(new students(2,"sai","kumar"));
		
		List<students>s2 = new ArrayList<students>();
		s2.add(new students(1,"anjali","reddy"));
		s2.add(new students(2,"rama","krishna"));
		
		List<students>studentlist = new ArrayList<students>();
		studentlist.addAll(s1);
		studentlist.addAll(s2);
		
		Scanner sc = new Scanner(System.in);
		String fn,ln;
		System.out.println("Enter first name : ");
		fn = sc.nextLine();
		System.out.println("Enter last name : ");
		ln = sc.nextLine();
		for(students i:studentlist){
		    if(i.firstname.equals(fn) && i.lastname.equals(ln))
		        System.out.println(i.roll+" "+i.firstname+" "+i.lastname);
		}
 	}
}
