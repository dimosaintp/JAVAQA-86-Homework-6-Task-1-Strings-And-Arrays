package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж.

    public int sumOfAllSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    // Средняя сумма продаж в месяц.

    public int averageSalesPerMonth(long[] sales) {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        return average / sales.length;
    }

    // Номер последнего месяца, в котором был пик продаж.

    public int peakSalesDay(long[] sales) {
        int peak = 0;
        for (int i = 0; i < sales.length; i++) {
            if (i > peak) {
                peak = i;
            }
        }
        return peak;
    }

    // Номер последнего месяца, в котором был минимум продаж.

    public int minSalesDay(long[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего.

    public int monthsSalesBelowAverage(long[] sales) {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        average = average / sales.length;

        long belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage++;
            }
        }
        return (int) belowAverage;
    }

    // Количество месяцев, в которых продажи были выше среднего.

    public int monthsSalesHigherAverage(long[] sales) {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        average = average / sales.length;

        long higherAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higherAverage++;
            }
        }
        return (int) higherAverage;
    }
}