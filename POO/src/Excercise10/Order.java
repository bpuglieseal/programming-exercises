package Excercise10;

public class Order {
    private Client client;
    private String orderNumber;
    private Item item;

    Order(Client client, String orderNumber, Item item) {
        this.client = client;
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void show() {
        System.out.format("----- Order: %s -----\n", this.orderNumber);
        System.out.format("Client Name: %s\n",this.client.getName());
        this.item.show();
    }
}
