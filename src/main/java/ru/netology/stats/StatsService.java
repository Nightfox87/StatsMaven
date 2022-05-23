package ru.netology.stats;

public class StatsService {

    public long sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(int[] sales) {
        int averageSale = 0;
        for (int sale : sales) {
            averageSale += sale;
        }
        averageSale = averageSale / sales.length;

        return averageSale;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int lessAverageMonthCount(int[] sales) {
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                count++;
            }
        }

        return count;
    }

    public int overAverageMonthCount(int[] sales) {
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                count++;
            }
        }

        return count;
    }

}
