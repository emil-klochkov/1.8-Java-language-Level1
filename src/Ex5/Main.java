package Ex5;

public class Main {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());
    }
}