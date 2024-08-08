import dal.UserDatabase;
import entities.Order;
import entities.Product;
import entities.ProductFactory;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldApp {

    public static void main(String[] args) {

        // Create a user database - Singleton-Design-Pattern
        UserDatabase userDatabase = UserDatabase.getInstance();
        System.out.println("UserDatabase: "+userDatabase);

        // Create products - Factory-Design-Pattern
        ProductFactory productFactory = new ProductFactory();
        Product electronicProduct = productFactory.createProduct("electronics");
        electronicProduct.displayInfo();

        Product clothingProduct = productFactory.createProduct("clothing");
        clothingProduct.displayInfo();

        // Create the user account - Builder-Design-Pattern
        UserAccount.UserAccountBuilder userAccountBuilder = new UserAccount.UserAccountBuilder("username", "pwd");
        UserAccount userAccount = userAccountBuilder.build();
        System.out.println("UserAccount: "+userAccount);


        List<Product> products = new ArrayList<>();
        products.add(electronicProduct);
        products.add(clothingProduct);
        // Create the order - Builder-Design-Pattern
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder("orderId", products);
        Order order = orderBuilder.build();
        System.out.println("Order: "+order);
    }
}
