package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Сумма всех продаж.

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumOfAllSales = 180;
        long actualSumOfAllSales = service.sumOfAllSales(sales);
        Assertions.assertEquals(expectedSumOfAllSales, actualSumOfAllSales);

        System.out.println("Сумма всех продаж: " + service.sumOfAllSales(sales));
    }

    // Средняя сумма продаж в месяц.

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSalesPerMonth = 15;
        long actualAverageSalesPerMonth = service.averageSalesPerMonth(sales);
        Assertions.assertEquals(expectedAverageSalesPerMonth, actualAverageSalesPerMonth);

        System.out.println("Средняя сумма продаж в месяц: " + service.averageSalesPerMonth(sales));

    }

    // Номер последнего месяца, в котором был пик продаж.

    @Test
    public void peakSalesDay() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedPeakSalesDay = 8;
        int actualPeakSalesDay = service.peakSalesDay(sales);
        Assertions.assertEquals(expectedPeakSalesDay, actualPeakSalesDay);

        System.out.println("Номер последнего месяца, в котором был пик продаж: " + service.peakSalesDay(sales));
    }

    // Номер последнего месяца, в котором был минимум продаж.

    @Test
    public void minSalesDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSalesDay = 9;
        long actualMinSalesDay = service.minSalesDay(sales);
        Assertions.assertEquals(expectedMinSalesDay, actualMinSalesDay);

        System.out.println("Номер последнего месяца, в котором был минимум продаж: " + service.minSalesDay(sales));
    }

    // Количество месяцев, в которых продажи были ниже среднего.

    @Test
    public void monthsSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        long expectedMonthsSalesBelowAverage = 5;
        long actualMonthsSalesBelowAverage = service.monthsSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonthsSalesBelowAverage, actualMonthsSalesBelowAverage);

        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.monthsSalesBelowAverage(sales));
    }

    // Количество месяцев, в которых продажи были выше среднего.

    @Test
    public void monthsSalesHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthsSalesHigherAverage = 5;
        long actualMonthsSalesHigherAverage = service.monthsSalesHigherAverage(sales);
        Assertions.assertEquals(expectedMonthsSalesHigherAverage, actualMonthsSalesHigherAverage);

        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.monthsSalesHigherAverage(sales));
    }
}