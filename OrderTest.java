public class OrderTest {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        OrderProcessor orderProcessor = new OrdProccessor();
        OrderAction orderAction = new OrderAction(order, orderProcessor);

        // Process the order
        orderAction.processOrder(10.0, 2, "John Doe", "123 Main St");
    }
}