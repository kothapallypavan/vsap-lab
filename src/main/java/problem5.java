import java.util.*;
import java.io.*;

class studentclass{
    int roll;
    String firstname;
    String lastname;
    public studentclass(int roll,String firstname,String lastname){
        this.roll = roll;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
public class problem5
{
    public static void main(String[] args) {
        List<studentclass>s1 = new ArrayList<studentclass>();
        s1.add(new studentclass(1,"pavan","kalyan"));
        s1.add(new studentclass(2,"sai","kumar"));

        List<studentclass>s2 = new ArrayList<studentclass>();
        s2.add(new studentclass(1,"anjali","reddy"));
        s2.add(new studentclass(2,"rama","krishna"));

        List<studentclass>studentlist = new ArrayList<studentclass>();
        studentlist.addAll(s1);
        studentlist.addAll(s2);

        Scanner sc = new Scanner(System.in);
        String fn,ln;
        System.out.println("Enter first name : ");
        fn = sc.nextLine();
        System.out.println("Enter last name : ");
        ln = sc.nextLine();
        for(studentclass i:studentlist){
            if(i.firstname.equals(fn) && i.lastname.equals(ln))
                System.out.println(i.roll+" "+i.firstname+" "+i.lastname);
        }
    }
}