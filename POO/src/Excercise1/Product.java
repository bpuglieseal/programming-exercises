package Excercise1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Product {
    private final String product_name;
    private final double product_price;
    private final int product_amount;

    Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.product_name = nameAtStart;
        this.product_price = priceAtStart;
        this.product_amount = amountAtStart;
    }

    public void print () {
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);

        System.out.format("%s, price %s, amount %d", this.product_name, formatter.format(this.product_price), this.product_amount);
    }
}
