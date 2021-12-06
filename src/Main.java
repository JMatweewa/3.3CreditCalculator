public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentAmount = service.calculate(1_000_000, 36, 9.99);

        System.out.println("Ваш ежемесячный платеж составит " + Math.round(100 * monthlyPaymentAmount) / 100 + " руб.");
    }
}