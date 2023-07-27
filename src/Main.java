public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int years = 1;
        int monthlyPayment = service.calculate(sum, years);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);
    }
}