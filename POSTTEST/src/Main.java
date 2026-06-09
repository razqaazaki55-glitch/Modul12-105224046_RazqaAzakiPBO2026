public class Main {
    public static void main(String[] args) {
        OrderDatabase db = new PenyimpananPesanan();
        EmailNotifier emailNotifier = new EmailSystem(); 
        
        // Transaksi dengan Kartu Kredit
        System.out.println("--- Transaksi 1 (Kartu Kredit) ---");
        PaymentMethod ccPayment = new CreditCard();
        OrderService service1 = new OrderService(db, ccPayment, emailNotifier);
        service1.processPayment("ORD-001", 500000);
        
        // Transaksi dengan Gift Voucher
        System.out.println("\n--- Transaksi 2 (Gift Voucher) ---");
        PaymentMethod voucherPayment = new GiftVoucher();
        OrderService service2 = new OrderService(db, voucherPayment, emailNotifier);
        service2.processPayment("ORD-002", 150000);
    }
}