public class InterfaceEx{
    public interface Category{
        public void showName();
        public void showDescription();
    }

    public class Dress implements Category{
        private String name;
        private String description;

        public Dress(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public void showName() {
            System.out.println("Dress Name: " + name);
        }

        @Override
        public void showDescription() {
            System.out.println("Description: " + description);
        }
    }

    public static void main(String[] args) {
        InterfaceEx ex = new InterfaceEx();
        Dress myDress = ex.new Dress("Evening Gown", "A beautiful evening gown suitable for formal events.");
        myDress.showName();
        myDress.showDescription();
    }
}