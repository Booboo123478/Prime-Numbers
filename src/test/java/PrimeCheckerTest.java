import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
    
    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0), "0 should not be prime");
    }

    @Test
    public void test1IsNotPrime() {
        assertFalse(primeChecker.isPrime(1), "1 should not be prime");
    }

    @Test
    public void test2IsPrime() {
        assertTrue(primeChecker.isPrime(2), "2 should be prime");
    }

    @Test
    public void test3IsPrime() {
        assertTrue(primeChecker.isPrime(3), "3 should be prime");
    }
    
    @Test
    public void test4IsNotPrime() {
        assertFalse(primeChecker.isPrime(4), "4 should not be prime");
    }

    @Test
    public void test5IsPrime() {
        assertTrue(primeChecker.isPrime(5), "5 should not be prime");
    }

    @Test
    public void test6IsNotPrime() {
        assertFalse(primeChecker.isPrime(6), "6 should not be prime");
    }

    @Test
    public void test7IsPrime() {
        assertTrue(primeChecker.isPrime(7), "7 should be prime");
    }

    @Test
    public void test8NotIsPrime() {
        assertFalse(primeChecker.isPrime(8), "8 should not be prime");
    }

    @Test
    public void test9IsPrime() {
        assertFalse(primeChecker.isPrime(9), "9 should not be prime");
    }
}

