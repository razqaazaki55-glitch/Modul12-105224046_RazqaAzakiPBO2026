//Memecah interface menjadi beberapa antarmuka kecil
interface EmailNotifier {
    public void sendEmail();
}

interface SMSNotifier {
    public void sendSMS();
}

interface WhatsAppNotifier {
    public void sendWhatsApp();
}
//emailsystem ini tidak ada paksaan membuat metoda sendsma() dan sendWhatsApp() yang isinya kosong
class EmailSystem implements EmailNotifier {
    @Override
    public void sendEmail() {
        System.out.println("Mengirim Email: Notifikasi resi pemesanan kepada pengguna.");
    }
}

class WhatsAppSystem implements WhatsAppNotifier {
    @Override
    public void sendWhatsApp() {
        System.out.println("Mengirim WhatsApp: Notifikasi resi pemesanan kepada pengguna.");
    }
}