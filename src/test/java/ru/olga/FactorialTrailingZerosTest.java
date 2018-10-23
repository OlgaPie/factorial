package test.java.ru.olga;

import main.java.ru.olga.FactorialTrailingZeros;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZerosTest {

    @Test
    public void calculationTrailingZerosTest() {
        int zero1 = FactorialTrailingZeros.calculationTrailingZeros("101000");
        int zero2 = FactorialTrailingZeros.calculationTrailingZeros("101002000000000000000000000000000");
        Assert.assertEquals(3, zero1);
        Assert.assertEquals(27, zero2);
    }

    @Test
    public void calculationFactorialTest() {
        String fact1 = FactorialTrailingZeros.calculationFactorial(3);
        String fact2 = FactorialTrailingZeros.calculationFactorial(12);
        Assert.assertEquals("6", fact1);
        Assert.assertEquals("479001600", fact2);
    }
}