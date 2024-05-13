public class OrderAction {
    private final Order order;
    private final OrderProcessor orderProcessor;

    public OrderAction(Order order, OrderProcessor orderProcessor) {
        this.order = order;
        this.orderProcessor = orderProcessor;
    }

    public void processOrder(double price, int quantity, String customerName, String address) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
        orderProcessor.generateInvoice("order_123.pdf"); // Invoice generation
        orderProcessor.sendEmailNotification("johndoe@example.com"); // Email notification
    }
}