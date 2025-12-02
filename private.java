class Private {
    private int secretNumber = 42;

    private void revealSecret() {
        System.out.println("The secret number is: " + secretNumber);
    }

    public void accessSecret() {
        revealSecret();
    }

    public static class Main {
        public static void main(String[] args) {

            Private myPrivate = new Private();
            myPrivate.accessSecret();
        }
    }
}