package test.java.ru.olga;

import main.java.ru.olga.FactorialTrailingZeros;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTrailingZerosTest {

    @Test
    public void calculationTrailingZerosTest() {
        int zero1 = FactorialTrailingZeros.calculationTrailingZeros(10000);
        int zero2 = FactorialTrailingZeros.calculationTrailingZeros(10000000);
        Assert.assertEquals(2499, zero1);
        Assert.assertEquals(2499999, zero2);
    }

}