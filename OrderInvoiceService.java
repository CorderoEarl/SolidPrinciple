public class OrderInvoiceService implements OrderInvoice{
    
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
