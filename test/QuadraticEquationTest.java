import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to check method solve(double a, double b, double c) in QuadraticEquations class
 * hint for assertArrayEquals(expected, actual, delta)
 */
public class QuadraticEquationTest {
    QuadraticEquation qe = new QuadraticEquation();

    @Test
    public void twoSolutions(){
        // x^2 - 5*x + 4
        assertArrayEquals(new double[]{1.0, 4.0}, qe.solve(1.0, -5.0, 4.0), 0.001);
        // x^2 + x - 4
        assertArrayEquals(new double[]{-2.56, 1.56}, qe.solve(1.0, 1.0, -4.0), 0.001);
        // x^2 - 13*x + 12
        assertArrayEquals(new double[]{1.0, 12.0}, qe.solve(1.0, -13.0, 12.0), 0.001);
        // -6*x^2 - 5*x - 1
        assertArrayEquals(new double[]{-0.33, -0.5}, qe.solve(-6.0, -5.0, -1.0), 0.001);
        // 2*x^2 + 4*x - 7
        assertArrayEquals(new double[]{-3.12, 1.12}, qe.solve(2.0, 4.0, -7.0), 0.001);
        // x^2 - 7*x
        assertArrayEquals(new double[]{0.0, 7.0}, qe.solve(1.0, -7.0, 0.0), 0.001);
        // 4*x^2 - 9
        assertArrayEquals(new double[]{-1.5, 1.5}, qe.solve(4.0, 0.0, -9.0), 0.001);
    }

    @Test
    public void oneSolution(){
        // x^2 + 6*x + 9
        assertArrayEquals(new double[]{-3.0}, qe.solve(1.0, 6.0, 9.0), 0.001);
        // x^2 + 12*x + 36
        assertArrayEquals(new double[]{-6.0}, qe.solve(1.0, 12.0, 36.0), 0.001);
        // -4*x^2 + 12*x - 9
        assertArrayEquals(new double[]{1.5}, qe.solve(-4.0, 12.0, -9.0), 0.001);
        // 9*x^2 + 12*x + 4
        assertArrayEquals(new double[]{-0.67}, qe.solve(9.0, 12.0, 4.0), 0.001);
        // 4*x^2 - 20*x + 25
        assertArrayEquals(new double[]{2.5}, qe.solve(4.0, -20.0, 25.0), 0.001);
    }

    @Test
    public void noSolution(){
        // -6*x^2 - 1
        assertArrayEquals(new double[]{}, qe.solve(-6.0, 0.0, -1.0), 0.001);
        // 0.5*x^2 +4*x + 10
        assertArrayEquals(new double[]{}, qe.solve(0.5, 4.0, 10.0), 0.001);
        // x^2 + 25
        assertArrayEquals(new double[]{}, qe.solve(1.0, 0.0, 25.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArgument(){
        // 0*x^2 + 2*x + 4
        qe.solve(0.0, 2.0, 4.0);
    }

}
