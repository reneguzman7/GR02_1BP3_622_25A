package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    @Before
    public void setUp() {
        c = new Calculator();
        System.out.println("setUp");
    }
    @Test
    public void given_two_integers_when_addition_then_ok () {
        System.out.println("Test 1");
        assertEquals(3, c.add(1, 2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok () {

        System.out.println("Test 2");
        assertEquals(1, c.sub(2, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_intefers_when_division_then_exception() {
        System.out.println("Test 3");
        assertEquals(3, c.div(1, 0));
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout() {
        System.out.println("Test 4");
        assertEquals(2, c.mul(1, 2));
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        c.setAns(0);
        c = null;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
}