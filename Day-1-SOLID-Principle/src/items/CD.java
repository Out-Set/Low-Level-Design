package items;

/**
 * Open close principle
 * --------------------
 * Open -> Extension
 * Close -> Modification
 */

public class CD implements LibraryItem {

    private String title;

    private String uniqueId;

    private double value;

    private String artist;

    public CD(String title, String uniqueId, double value, String artist) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.value = value;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 20;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
