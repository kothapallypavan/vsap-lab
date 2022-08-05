class shape{
    void draw(){
        System.out.println("draw shape");
    }
    void erase(){
        System.out.println("erase shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("draw circle");
    }
    void erase(){
        System.out.println("erase circle");
    }
}
class triangle extends shape{
    void draw(){
        System.out.println("draw triangle");
    }
    void erase(){
        System.out.println("erase triangle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("draw square");
    }
    void erase(){
        System.out.println("erase square");
    }
}
public class Main
{
	public static void main(String[] args) {
		shape s = new shape();
		circle c = new circle();
		triangle t = new triangle();
		square sq = new square();
		
		s.draw();
		s.erase();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		sq.draw();
		sq.erase();
	}
}
