package dal;

/**
 * Singleton, so that only one instance/object can be created
 */
public class UserDatabase {

    private static UserDatabase instance;

    private UserDatabase() {
        // Make the constructor private so that no one can access it from outside the class
    }

    // Synchronized: Ensures that only one thread at a time/moment can execute this method.
    // Due to that there is no chance that multiple instance/object will be created.
    public static synchronized UserDatabase getInstance(){
        if(instance == null){
            instance = new UserDatabase();
        }

        return instance;
    }
}
