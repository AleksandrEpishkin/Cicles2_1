package ru.netology.stats;

public class StatsService {


    public double calculateSumSales(double[] sales) {
        long sum = 0;
        for (double sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSales(double[] sales) {
        double sum = calculateSumSales(sales);
        double average = sum / sales.length;
        average = Math.round(average * 100.0) / 100.0;
        return (double) average;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(double[] sales) {
        double average = calcAverageSales(sales);
        int month = 0;
        for (double sale : sales)
            if (sale < average) {
                month++;
            }
        return month;
    }

    public int abowAverage(double[] sales) {
        double average = calcAverageSales(sales);
        int month = 0;
        for (double sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }


}
