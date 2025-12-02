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