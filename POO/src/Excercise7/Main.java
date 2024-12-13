package Excercise7;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    public static void main(String[] args) {
        Straight st = new Straight(10, -5, 7, 3, -4);
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);
        st.show();

        if (st.isHorizontal()) {
            System.out.println("The Straight is horizontal");
        } else if (st.isVertical()) {
            System.out.println("The Straight is vertical");
        } else {
            System.out.println("The Straight is not vertical or horizontal");
        }

        System.out.format("Lenght of the straight: %s", formatter.format(st.lenght()));
    }
}
