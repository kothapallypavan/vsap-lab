import java.util.*;
import java.io.*;

class Students{
    String name;
    String email;
    String section;
    public Students(String name,String email,String section){
        this.name = name;
        this.email = email;
        this.section = section;
    }
}
public class problem6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Students>map = new HashMap<Integer,Students>();
        map.put(581,new Students("pavan","pavan@gmail.com","A"));
        map.put(582,new Students("ram","ram@gmail.com","A"));
        map.put(583,new Students("sanjay","sanjay@gmail.com","B"));

        int ch;
        System.out.println("Enter Roll number : ");
        int roll = sc.nextInt();
        for(Map.Entry<Integer,Students>mp:map.entrySet()){
            if(mp.getKey()==roll){
                System.out.println(mp.getKey()+" "+mp.getValue().name+" "+mp.getValue().email+" "+mp.getValue().section);
            }
        }
        String namevalue,emailvalue;
        System.out.println("Enter name and email: ");
        namevalue = sc.next();
        emailvalue = sc.next();
        for(Map.Entry<Integer,Students>mp:map.entrySet()){
            if(mp.getValue().name.equals(namevalue) && mp.getValue().email.equals(emailvalue))
                System.out.println(mp.getKey()+" "+mp.getValue().name+" "+mp.getValue().email+" "+mp.getValue().section);
        }


    }
}