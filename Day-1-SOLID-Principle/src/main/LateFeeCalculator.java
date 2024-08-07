package main;

public class LateFeeCalculator {

    /**
     * Logic to calculate the late fee
     */

    // This method takes interface instead of concrete class
    // Because we are coding for Abstraction
    // This is called 'Dependency Inversion Principle'
    public double calculateTotalLateFees(LateFeeCalculatable[] items, int days){
        double totalLateFee = 0;
        for (LateFeeCalculatable item: items){
            totalLateFee += item.calculateLateFee(days);
        }

        return totalLateFee;
    }
}
