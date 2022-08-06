import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem1Test {

    @Test
    void box() {
        box b = new box();
        b.setval(1,2);
        assertEquals(2,b.area());
    }
    @Test
    void box3d(){
        box3d b3 = new box3d();
        b3.setval(1,2,3);
        assertEquals(6,b3.volume());
    }
}