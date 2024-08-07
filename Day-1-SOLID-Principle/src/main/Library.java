package main;

import items.LibraryItem;

/**
 * Liskov's Substitution Principle
 */

public class Library {

    private LibraryItem[] items;

    /**
     * Calculate the total value of library item
     */

    // Iterating over library-items, it could be Book, CD or DVD.
    // Parent-object can be replaced with any child-object and this replacement there is no risk at all.
    // This is called as 'Liskov's Substitution Principle'
    public double calculateTotalValue(){
        double totalValue = 0;
        for (LibraryItem item: items){
            totalValue += item.getValue();
        }

        return totalValue;
    }
}
