public class IntegralCalculator {

    // Method to calculate the integral using the trapezoidal rule
    public static double integrate(double a, double n, double lowerLimit, double upperLimit, int numIntervals) {
        double intervalWidth = (upperLimit - lowerLimit) / numIntervals;  // Width of each trapezoid
        double sum = 0.0;
        
        // Loop to calculate the sum of the areas of the trapezoids
        for (int i = 0; i <= numIntervals; i++) {
            // Calculate x-value at the i-th point
            double x = lowerLimit + i * intervalWidth;
            
            // Evaluate the function at the i-th point (either at the start, end, or in the middle)
            double functionValue = Math.exp(a * x) * Math.cos(n * x);
            
            // Add function value, but adjust for start and end points
            if (i == 0 || i == numIntervals) {
                sum += functionValue / 2;  // First and last points count half
            } else {
                sum += functionValue;  // Middle points count fully
            }
        }
        
        // Multiply by the width of each interval to get the total area
        return sum * intervalWidth;
    }

    public static void main(String[] args) {
        // Example values for the integral of e^(ax) * cos(nx)
        double a = 1.0;  // a in e^(ax)
        double n = 2.0;  // n in cos(nx)
        double lowerLimit = 0.0;  // Lower limit of the integral
        double upperLimit = 10.0;  // Upper limit of the integral
        int numIntervals = 1000;  // Number of intervals for the trapezoidal rule

        // Calculate the integral
        double result = integrate(a, n, lowerLimit, upperLimit, numIntervals);

        // Output the result
        System.out.println("The approximate integral is: " + result);
    }
}
