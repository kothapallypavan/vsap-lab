class box{
    public int length;
    public int breadth;
    public box(){
        length=0;
        breadth=0;
    }
    public void setval(int x,int y){
        length=x;
        breadth=y;
    }
    public int area(){
        return (length*breadth);
    }
}
class box3d extends box{
    public int height;
    public box3d(){
        length=0;
        breadth=0;
        height=0;
    }
    public void setval(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class problem1
{
    public static void main(String[] args) {
        box b1 = new box();
        box3d b2 = new box3d();
        b1.setval(1,2);
        b2.setval(1,2,3);
        System.out.println("Area : "+b1.area());
        System.out.println("Volume : "+b2.volume());
    }
}