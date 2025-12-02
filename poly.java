public class Poly{
    public void display(int number){
        System.out.println("Displaying integer: " + number);
    }

    public void display(String text){
        System.out.println("Displaying string: " + text);
    }

    public void display(double decimal){
        System.out.println("Displaying double: " + decimal);
    }

    public static void main(String[] args) {
        Poly poly = new Poly();
        poly.display(10);
        poly.display("Hello, World!");
        poly.display(3.14);
    }
}