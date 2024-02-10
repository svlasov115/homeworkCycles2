public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int myMonthlySavings = 15000;
        int myTotalOfAnnualSavings = 0;
        int monthOfSavings = 0;
        double percent = 1 / 100D;
        double sum = 0;
        int purpose = 2459000;

        while (sum <= purpose) {
            monthOfSavings++;
            sum += sum * percent;
            sum += myMonthlySavings;
            System.out.println("Месяц " + monthOfSavings + "，сумма накоплений равна " + sum + " рублей");
        }
    }
}