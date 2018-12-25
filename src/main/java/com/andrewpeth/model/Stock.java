package com.andrewpeth.model;

/**
 *
 */
public class Stock {

    private String ticker;
    private double price;
    private double  high;
    private double low;
    private int volume;

    public Stock(String ticker, double price, double high, double low, int volume) {
        this.ticker = ticker;
        this.price = price;
        this.high = high;
        this.low = low;
        this.volume = volume;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
