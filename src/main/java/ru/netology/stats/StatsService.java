package ru.netology.stats;

public class StatsService {


    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSales(double[] sales) {
        double sum = 0;
        double average = 0;
        for (double sale : sales) {
            sum += sale;
            average = sum / sales.length;
            average = Math.round(average * 100.0) / 100.0;
        }
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

    public int belowAverage(long[] sales) {
        double sum = 0;
        double average = 0;
        for (double sale : sales) {
            sum += sale;
            average = sum / sales.length;
            average = Math.round(average * 100.0) / 100.0;
        }
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int abowAverage(long[] sales) {
        double sum = 0;
        double average = 0;
        for (double sale : sales) {
            sum += sale;
            average = sum / sales.length;
            average = Math.round(average * 100.0) / 100.0;
        }
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }


}
