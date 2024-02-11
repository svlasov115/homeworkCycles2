public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int myMonthlySavings = 15_000;
        int monthOfSavings = 0;
        double percent = 1 / 100D;
        double sum = 0;
        int purpose = 2_459_000;

        while (sum <= purpose) {
            monthOfSavings++;
            sum += sum * percent;
            sum += myMonthlySavings;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей.%n", monthOfSavings, sum);
        }

        // Задача 2;
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Задача 3
        System.out.println("\nЗадача 3");

        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        int years = 10;

        for (int year = currentYear + 1; year <= currentYear + years; year++) {
            population += (birthRatePerThousand - mortalityPerThousand) * population / 1_000;
            System.out.printf("Год %d, численность населения составляет %,d игрековцев.%n", year, population);
        }

        // Задача 4;
        System.out.println("Задача 4");
        monthOfSavings = 0;
        percent = 7 / 100D;
        sum = myMonthlySavings;

        while (sum < purpose) {
            monthOfSavings++;
            sum += sum * percent;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей.%n", monthOfSavings, sum);
        }

        // Задача 5;
        System.out.println("Задача 5");

        monthOfSavings = 0;
        sum = myMonthlySavings;

        while (sum < purpose) {
            monthOfSavings++;
            sum += sum * percent;
            if (monthOfSavings % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей.%n", monthOfSavings, sum);
            }
        }

        // Задача 6;
        System.out.println("Задача 6");

        monthOfSavings = 0;
        sum = myMonthlySavings;

        years = 9;
        int convertYearsToMonths = years * 12;

        while (monthOfSavings < convertYearsToMonths) {
            monthOfSavings++;
            sum += sum * percent;
            if (monthOfSavings % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей.%n", monthOfSavings, sum);
            }
        }

        // Задача 7;
        System.out.println("Задача 7");

        int firstFriday = 5;

        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
        }

        // Задача 8;
        System.out.println("Задача 8");

        currentYear = 2024;
        int start = currentYear - 200;
        int finish = currentYear + 100;
        int periodOfComet = 79;
        int startPeriodOfComet = 0;

        for (int year = startPeriodOfComet; year <= finish; year += periodOfComet) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }
}
