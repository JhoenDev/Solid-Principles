public interface OrderProcessor {
    void generateInvoice(String fileName);
    void sendEmailNotification(String email);
}