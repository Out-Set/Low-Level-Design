package items;

import main.LateFeeCalculatable;

/**
 * Single Responsibility Principle
 */

public interface LibraryItem extends LateFeeCalculatable {

    String getTitle();

    String getUniqueId();

    double getValue();
}
