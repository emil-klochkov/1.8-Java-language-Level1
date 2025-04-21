package Ex8;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = (s) -> new StringBuilder(s).reverse().toString();

        String input = "Barcelona";
        String output = reverse.reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }
}