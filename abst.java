public class Abst {
    public abstract class Animal {
        public abstract void makeSound();

        public void sleep() {
            System.out.println("Zzz...");
        }
    }

    public class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof Woof");
        }
    }

    public static void main(String[] args) {
        Abst abst = new Abst();
        Dog myDog = abst.new Dog();
        myDog.makeSound();
        myDog.sleep();
        // myDog.super.sleep();
    }
}