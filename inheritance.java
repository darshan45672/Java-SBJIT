public class Animals {
    private String habitat;
    private String sound;
    private int lifespan;

    public Animals(String habitat, String sound, int lifespan) {
        this.habitat = habitat;
        this.sound = sound;
        this.lifespan = lifespan;
    }

    public void sound(){
        System.out.println("The animal makes a sound: " + sound);
    }
    public void info(){
        System.out.println("Habitat: " + habitat + ", Lifespan: " + lifespan + " years");
    }
}

class Dog extends Animals {
    private String breed;

    public Dog(String habitat, String sound, int lifespan, String breed) {
        super(habitat, sound, lifespan);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("The dog barks: " + super.sound);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Breed: " + breed);
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Domestic", "Woof", 13, "Labrador");
        myDog.sound();
        myDog.info();
        myDog.bark();
    }
}