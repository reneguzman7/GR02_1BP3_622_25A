package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {

    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1, 2, 3});
        objects.add(new Object[]{2, 3, 5});
        objects.add(new Object[]{3, 4, 7});
        objects.add(new Object[]{4, 5, 9});
        objects.add(new Object[]{5, 6, 11});
        objects.add(new Object[]{6, 7, 13});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_ok() {
        Calculator c = new Calculator();
        assertEquals(expected, c.add(a, b));
    }

}