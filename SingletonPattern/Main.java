public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("User logged in.");
        logger2.log("User added item to cart.");

        if (logger1 == logger2) {
            System.out.println("Same instance used for both logs.");
        } else {
            System.out.println("Different instances – Singleton failed.");
        }
    }
}
