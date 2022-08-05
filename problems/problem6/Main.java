
import java.util.*;
import java.io.*;

class students{
    String name;
    String email;
    String section;
    public students(String name,String email,String section){
        this.name = name;
        this.email = email;
        this.section = section;
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,students>map = new HashMap<Integer,students>();
		map.put(581,new students("pavan","pavan@gmail.com","A"));
		map.put(582,new students("ram","ram@gmail.com","A"));
		map.put(583,new students("sanjay","sanjay@gmail.com","B"));
        
        int ch;
        System.out.println("Enter Roll number : ");
        int roll = sc.nextInt();
        for(Map.Entry<Integer,students>mp:map.entrySet()){
            if(mp.getKey()==roll){
                System.out.println(mp.getKey()+" "+mp.getValue().name+" "+mp.getValue().email+" "+mp.getValue().section);   
            }
        }
        String namevalue,emailvalue;
        System.out.println("Enter name and email: ");
        namevalue = sc.next();
        emailvalue = sc.next();
        for(Map.Entry<Integer,students>mp:map.entrySet()){
            if(mp.getValue().name.equals(namevalue))
                System.out.println(mp.getKey()+" "+mp.getValue().name+" "+mp.getValue().email+" "+mp.getValue().section);
        }
        
        
 	}
}
