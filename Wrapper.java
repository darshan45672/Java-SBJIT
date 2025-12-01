// Program for Wrapper class in Java

public class Wrapper{
    public static void main(String[] args) {
        Double d1 = Double.valueOf(10.5);
        Double d2 = Double.valueOf(10);
        Double d3 = 10.5;
        Double d4 = 10.0;  // Fixed: added .0 to make it a double literal
        Float f1 = 12.0f;  // Fixed: added .0f to make it a float literal

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        
    }
}