public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж составляет " + service.calculate(1_000_000, 9.99f, 12) + " на 12 месяцев");
        System.out.println("Ежемесячный платеж составляет " + service.calculate(1_000_000, 9.99f, 24) + " на 24 месяцев");
        System.out.println("Ежемесячный платеж составляет " + service.calculate(1_000_000, 9.99f, 36) + " на 36 месяцев");
    }
}