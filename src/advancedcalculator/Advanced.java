
package advancedcalculator;

import java.util.ArrayList;
import java.util.List;


public class Advanced extends Calculator{
     public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number.");
            return 0;
        }
        return Math.sqrt(a);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

// Calculator History Class
class CalculatorHistory {
    private List<String> history = new ArrayList<>();

    public void addHistory(String record) {
        history.add(record);
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No history available.");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
    }
    
}
