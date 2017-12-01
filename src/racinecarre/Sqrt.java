
package racinecarre;
public class Sqrt { 
    
    public double solveSQRT(double c) throws IllegalArgumentException{ 

        // read in the command-line argument
        if(c<0){
            throw new IllegalArgumentException();
        }
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        return t; 
    }

}
