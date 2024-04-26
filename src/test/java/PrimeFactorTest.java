import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        this.primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf1() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactorOf2() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimeFactorOf3() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimeFactorOf4() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }

    @Test
    void testPrimeFactorOf6() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }

    @Test
    void testPrimeFactorOf9() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(3, 3), primeFactor.of(9));
    }

    @Test
    void testPrimeFactorOf12() {
        this.primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2, 2, 3), primeFactor.of(12));
    }
}