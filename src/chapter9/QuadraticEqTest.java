package chapter9;

import JUNIT.Stopwatch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticEqTest {
    QuadraticEq qe;
    double disTest;

    @Before
    public void setup() {
        qe = new QuadraticEq();
        disTest = qe.getDiscriminant();
    }

    @Test
    public void testNegative() {
        if (disTest < 0) {
            assertEquals("No Roots", qe.getSolution());
        }
    }
@Test
    public void testPositive() {
        if (disTest > 0) {
            assertEquals("Two Roots", qe.getSolution());
        }
    }
@Test
    public void testNeutral() {
        if (disTest == 0) {
            assertEquals("One root" + qe.getRoot1(), qe.getSolution());
        }

    }
}