package ChristmasHomework;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;

public class Visit {
    private Client client;
    private Date date;
    private double cost;

    Visit(Client client, Date date) {
        this.date = date;
        this.client = client;
        this.cost = 0.0f;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void applyDiscount() {
        this.cost = this.client.getDiscount(this.cost);
    }

    @Override
    public String toString() {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("##.##", symbol);

        return String.format("Date: %s | Cost: %s | Client: %s", this.date.toString(), formatter.format(this.cost), this.client.toString());
    }

    public Client getClient() {
        return client;
    }
}
