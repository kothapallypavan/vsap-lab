import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem4Test {

    fibandmax f = new fibandmax();
    @Test
    void findMaxRec() {
        int a[] = {1, 5,-2,3};
        assertEquals(5,f.findMaxRec(a,4));
    }

    @Test
    void fib() {
        assertEquals(3,f.fib(4));
    }
}