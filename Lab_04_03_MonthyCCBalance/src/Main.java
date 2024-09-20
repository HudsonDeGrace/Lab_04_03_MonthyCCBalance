public class Main {
    public static void main(String[] args)
    {
        int balance = 5000;
        double interest = balance * 0.17;
        System.out.println("Your interest due for this month is $" + interest + ".");
        double newBalance = balance + interest;
        double newInterest = newBalance * 0.17;
        System.out.println("Your interest due for next month is $" + newInterest + ".");
    }
}