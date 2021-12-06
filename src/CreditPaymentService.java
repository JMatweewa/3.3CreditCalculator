public class CreditPaymentService {
    public double calculate (int loanAmount, int numberOfMonths, double annualInterestRate) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double monthlyPaymentAmount = loanAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1)));

        return monthlyPaymentAmount;

    }
}
