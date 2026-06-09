//memisahkan penyimpan data ke antarmuka tersendiri 
interface OrderDatabase {
    public void saveOrder(String orderData);
}
//kelas ini hanya mengurus penyimpanan pesanan pelanggan 
class PenyimpananPesanan implements OrderDatabase {
    @Override
    public void saveOrder(String orderData) {
        System.out.println("Menyimpan data pesanan pelanggan langsung: " + orderData);
    }
}


