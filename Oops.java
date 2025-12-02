public class Oops {

    public class Car{
        private String model;
        private int year;

        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
        public String getModel() {
            return model;
        }
        public int getYear() {
            return year;
        }

        public void displayInfo() {
            System.out.println("Model: " + model + ", Year: " + year);
        }
    }
    
    public void displayInfo(){
        System.out.println("This is a method inside the Oops class.");
    }
    public static void main(String[] args) {
        Oops myObj = new Oops();
        myObj.displayInfo();
        Car myCar = myObj.new Car("Toyota", 2020);
        myCar.displayInfo();
    }
}