import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class PrimeCheckerTest {
    
    private final PrimeChecker primeChecker = new PrimeChecker();
    
    @ParameterizedTest(name = "The number should be prime: {0}")
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
    void shouldBePrime(int number) {
        assertTrue(primeChecker.isPrime(number), number + " should be prime");
    }

    @ParameterizedTest(name = "The number should not be prime: {0}")
    @ValueSource(ints = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30})
    void shouldNotBePrime(int number) {
        assertFalse(primeChecker.isPrime(number), number + " should not be prime");
    }
}

