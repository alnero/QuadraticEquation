import java.math.BigDecimal;

/**
 * Class containing method to solve quadratic equations using its coefficients
 */

public class QuadraticEquation {
    /**
     * Method to solve quadratic equation a*x^2 + b*x + c = 0 having three coefficients,
     * All three coefficients can be positive, negative or zero. Roots rounded to two decimal places.
     * @param a - first coefficient a*x^2
     * @param b - second coefficient b*x
     * @param c - third coefficient c
     * @return array of double with the roots, which can hold zero, one, two or any(Double.NaN) roots.
     */

    public double[] solve(double a, double b, double c){
        if(a == 0 && b == 0 && c == 0){
            return new double[]{Double.NaN};
        }

        if(a == 0 && b == 0 && c != 0){
            return new double[0];
        }

        if(a == 0 && b != 0 && c == 0){
            return new double[]{0.0};
        }

        if(a == 0 && b != 0 && c != 0) {
            return new double[]{
                    new BigDecimal(-c / b).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
            };
        }

        double discr = Math.pow(b, 2) - 4 * a * c;

        if(discr > 0) {
            return new double[]{
                    new BigDecimal((-b - Math.sqrt(discr)) / (2 * a)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(),
                    new BigDecimal((-b + Math.sqrt(discr)) / (2 * a)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(),
            };
        } else if(Math.abs(discr) < 0.0001){ // discr == 0
            return new double[]{
                    new BigDecimal((-b / (2 * a))).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
            };
        } else {
            return new double[0];
        }
    }
}
