package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж.

    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц.

    public long averageSalesPerMonth(long[] sales) {
        long sum = sumOfAllSales(sales);
        return sum / sales.length;
    }

    // Номер последнего месяца, в котором был пик продаж.

    public int peakSalesDay(int[] sales) {
        int peak = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peak]) {
                peak = i;
            }
        }
        return peak + 1;
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

    public long monthsSalesBelowAverage(long[] sales) {
        long average = averageSalesPerMonth(sales);
        long belowAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    // Количество месяцев, в которых продажи были выше среднего.

    public long monthsSalesHigherAverage(long[] sales) {
        long average = averageSalesPerMonth(sales);
        long higherAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                higherAverage++;
            }
        }
        return (int) higherAverage;
    }
}