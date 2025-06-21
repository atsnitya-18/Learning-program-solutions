public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        System.out.println("--- Processing Payments ---");
        paypalProcessor.processPayment(1500);
        stripeProcessor.processPayment(2500);
    }
}
