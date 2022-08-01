import Quest02.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FibonacciTest {

    @Test
    void testFibonacci(){
        assertTrue(Fibonacci.isFibonacci(1));
        assertTrue(Fibonacci.isFibonacci(0));
        assertTrue(Fibonacci.isFibonacci(1));
        assertTrue(Fibonacci.isFibonacci(2));
        assertTrue(Fibonacci.isFibonacci(3));
        assertTrue(Fibonacci.isFibonacci(5));
        assertTrue(Fibonacci.isFibonacci(8));
        assertTrue(Fibonacci.isFibonacci(13));
        assertFalse(Fibonacci.isFibonacci(14));
    }

}