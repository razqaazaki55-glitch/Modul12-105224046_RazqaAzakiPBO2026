interface EmailNotifier { 
    public void sendEmail(); 
}
interface SMSNotifier { 
    public void sendSMS(); 
}
interface WhatsAppNotifier { 
    public void sendWhatsApp(); 
}

class EmailSystem implements EmailNotifier {
    @Override
    public void sendEmail() {
        System.out.println("Mengirim Email: Notifikasi resi pemesanan kepada pengguna.");
    }
}