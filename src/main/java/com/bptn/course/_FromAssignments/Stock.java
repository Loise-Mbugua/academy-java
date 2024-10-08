package com.bptn.course._FromAssignments;

public class Stock {
    // Declaring Instance variables
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase(); // Converting to uppercase
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0; // Initializing default value
        this.marketCap = calculateMarketCap(); // Calculating market cap
    }

    // Calculating market cap
    private long calculateMarketCap() {
        return (long) price * totalShares;
    }

    // Adjusting the price method
    public void adjustPrice(int change) {
        // Store the old price
        int oldPrice = price;

        // Update price
        price += change;

        // Finding percent change based on the old price
        percentChange = ((double) (price - oldPrice) / oldPrice) * 100;

        // Updating market cap
        marketCap = calculateMarketCap();
    }

    // Using toString method
    @Override
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: $" + price + " (" + percentChange + "%)\n" +
               "Market Cap: $" + marketCap; // Added dollar sign before market cap
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
