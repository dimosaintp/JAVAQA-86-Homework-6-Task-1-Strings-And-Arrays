package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Сумма всех продаж.

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж: " + service.sumOfAllSales(sales));
    }

    // Средняя сумма продаж в месяц.

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSalesPerMonth(sales));

    }

    // Номер последнего месяца, в котором был пик продаж.

    @Test
    public void peakSalesDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Номер последнего месяца, в котором был пик продаж: " + service.peakSalesDay(sales));
    }

    // Номер последнего месяца, в котором был минимум продаж.

    @Test
    public void minSalesDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Номер последнего месяца, в котором был минимум продаж: " + service.minSalesDay(sales));
    }

    // Количество месяцев, в которых продажи были ниже среднего.

    @Test
    public void monthsSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.monthsSalesBelowAverage(sales));
    }

    // Количество месяцев, в которых продажи были выше среднего.

    @Test
    public void monthsSalesHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.monthsSalesHigherAverage(sales));
    }
}