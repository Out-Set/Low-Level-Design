package formattors;

public class LowerCaseStrategy implements TextFormattingStrategy{

    @Override
    public String format(String text) {
        System.out.println("Converting to the lower case");
        return text.toLowerCase();
    }
}
