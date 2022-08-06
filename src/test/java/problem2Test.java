import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem2Test {
    Numbers n = new Numbers(189.23);
    @Test
    void reverse() {
        assertEquals(981.23,n.getReverse());
    }

    @Test
    void binary(){
        assertEquals("10111101",n.dispBinary());
    }
}