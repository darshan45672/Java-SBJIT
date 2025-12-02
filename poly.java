public class Poly{
    public void display(int number){
        System.out.println("Displaying integer: " + number);
    }

public class Quad extends Poly{
    @Override
    public void display(int number){
        System.out.println("Displaying integer in Quad class: " + number);
    }

    public void display(String text){
        System.out.println("Displaying string: " + text);
    }
} 

    public static void main(String[] args) {
        Poly polyObj = new Poly();
        polyObj.display(10);

        Quad quadObj = polyObj.new Quad();
        quadObj.display(20);
        quadObj.display("Hello, World!");
    }
}