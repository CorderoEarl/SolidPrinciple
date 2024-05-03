public class OrderTest {
    public static void main(String[] args) {
        OrderCalculation orderCalculation = new OrderCalculationService();
        OrderProcess orderProcess = new OrderProcessService();
        OrderInvoice orderInvoice = new OrderInvoiceServer();
        Notification notification = new NotificationService();

        orderCalculation.calculateTotal(150, 3);
        orderProcess.placeOrder("Earl Cordero", "123 Central Ave");
        orderInvoice.generateInvoice("Invoice.jpg");
        notification.sendEmailNotification("earlcordero@neu.edu");
    }
}