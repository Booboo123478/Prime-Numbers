import static org.junit.jupiter.api.Assertions.assertFalse;
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
 
}
