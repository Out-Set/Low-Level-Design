package entities;

/**
 * Factory-Design-Pattern: Dedicated factory class to create objects
 * Should have the control and logic to create Product objects
 */
public class ProductFactory {

    public Product createProduct(String category){

        switch (category.toLowerCase()){
            case "electronics":
                return new ElectronicProduct();

            case "clothing":
                return new ClothingProduct();

            // In future if needed we can add more products

            default :
                throw new IllegalArgumentException("Invalid category asked : " + category);
        }
    }
}
