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
    public void test9NotIsPrime() {
        assertFalse(primeChecker.isPrime(9), "9 should not be prime");
    }

    @Test
    public void test10NotIsPrime() {
        assertFalse(primeChecker.isPrime(10), "10 should not be prime");
    }

    @Test
    public void test11IsPrime() {
        assertTrue(primeChecker.isPrime(11), "11 should not be prime");
    }

    @Test
    public void test12NotIsPrime() {
        assertFalse(primeChecker.isPrime(12), "12 should not be prime");
    }

    @Test
    public void test13IsPrime() {
        assertTrue(primeChecker.isPrime(13), "13 should not be prime");
    }

    @Test
    public void test14NotIsPrime() {
        assertFalse(primeChecker.isPrime(14), "14 should not be prime");
    }

    @Test
    public void test15NotIsPrime() {
        assertFalse(primeChecker.isPrime(15), "15 should not be prime");
    }

    @Test
    public void test16NotIsPrime() {
        assertFalse(primeChecker.isPrime(16), "16 should not be prime");
    }

    @Test
    public void test17IsPrime() {
        assertTrue(primeChecker.isPrime(17), "17 should be prime");
    }

    @Test
    public void test18NotIsPrime() {
        assertFalse(primeChecker.isPrime(18), "18 should not be prime");
    }

    @Test
    public void test19IsPrime() {
        assertTrue(primeChecker.isPrime(19), "19 should be prime");
    }

    @Test
    public void test20NotIsPrime() {
        assertFalse(primeChecker.isPrime(20), "20 should not be prime");
    }

    @Test
    public void test21NotIsPrime() {
        assertFalse(primeChecker.isPrime(21), "21 should not be prime");
    }

    @Test
    public void test22NotIsPrime() {
        assertFalse(primeChecker.isPrime(22), "22 should not be prime");
    }

    @Test
    public void test23IsPrime() {
        assertTrue(primeChecker.isPrime(23), "23 should be prime");
    }

    @Test
    public void test24NotIsPrime() {
        assertFalse(primeChecker.isPrime(24), "24 should not be prime");
    }

    @Test
    public void test25NotIsPrime() {
        assertFalse(primeChecker.isPrime(25), "25 should not be prime");
    }

}

