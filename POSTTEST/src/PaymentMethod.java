//interface untu pembayaran
interface PaymentMethod {
    void pay(double amount);
}
//interface untuk fitur refund 
interface Refundable {
    void refund(double amount);
}
//Kartu kredit ada dua fitur pembayaran dan refund
class CreditCard implements PaymentMethod, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank: Membayar sejumlah " + amount + " dengan Kartu Kredit.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund sejumlah " + amount + " ke saldo Kartu Kredit.");
    }
}
//ovo hanya mendukung pembayaran saja
class OVO implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Memanggil API OVO: Membayar sejumlah " + amount + " dengan OVO.");
    }
}
//giftvoucher hanya mengambil interface dari paymentmethod
class GiftVoucher implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran " + amount + " menggunakan Gift Voucher.");
    }
}