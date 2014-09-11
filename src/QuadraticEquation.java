import java.math.BigDecimal;

/**
 * Class containing method to solve quadratic equations using its coefficients
 */

public class QuadraticEquation {
    /**
     * Method to solve quadratic equation a*x^2 + b*x + c = 0 having three coefficients,
     * all three can be positive or negative, roots rounded to two decimal places
     * @param a - first coefficient a*x^2, can't be 0
     * @param b - second coefficient b*x
     * @param c - third coefficient c
     * @return array of double with the roots, can hold one, two or zero roots
     * @throws java.lang.IllegalArgumentException if a == 0
     */

    public double[] solve(double a, double b, double c){
        if(a == 0) throw new IllegalArgumentException("First coefficient in quadratic equation should not be equal 0");

        double discr = Math.pow(b, 2) - 4 * a * c;

        if(discr > 0) {
            return new double[]{
                    new BigDecimal((-b - Math.sqrt(discr)) / (2 * a)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(),
                    new BigDecimal((-b + Math.sqrt(discr)) / (2 * a)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(),
            };
        } else if(Math.abs(discr) < 0.0001){ // discr == 0
            return new double[]{
                    new BigDecimal((-b / (2 * a))).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(),

            };
        } else {
            return new double[0];
        }
    }
}
