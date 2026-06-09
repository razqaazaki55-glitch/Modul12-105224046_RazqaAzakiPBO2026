class OrderService {
    private OrderDatabase database;
    private PaymentMethod payment;
    private EmailNotifier notifier; 

    public OrderService(OrderDatabase database, PaymentMethod payment, EmailNotifier notifier) {
        this.database = database;
        this.payment = payment;
        this.notifier = notifier; 
    }

    public void processPayment(String orderData, double amount) {
        //Menyimpan data pesanan pelanggan langsung
        this.database.saveOrder(orderData);
        
        //Mengeksekusi pemotongan saldo untuk pembayaran
        this.payment.pay(amount);
        
        //Mengirimkan notifikasi resi kepada pengguna
        this.notifier.sendEmail();
    }
}