public class CreditPaymentService {
    public float calculate(int credit, float rate, int time) {
        float monthlyRate = rate / 12 / 100;
        float payment = (float) (credit * (monthlyRate * Math.pow((1 + monthlyRate), time)) / (Math.pow((1 + monthlyRate), time) - 1));
        return Math.round(payment); // не получилось победить .0 в консоле SOS
                                    // Ежемесячный платеж составляет 87911.0 на 12 месяцев
                                    // Ежемесячный платеж составляет 46140.0 на 24 месяцев
                                    // Ежемесячный платеж составляет 32262.0 на 36 месяцев
    }
}