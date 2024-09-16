package formattors;

public class UpperCaseStrategy implements TextFormattingStrategy{

    @Override
    public String format(String text) {
        System.out.println("Converting to the upper case");
        return text.toUpperCase();
    }
}
