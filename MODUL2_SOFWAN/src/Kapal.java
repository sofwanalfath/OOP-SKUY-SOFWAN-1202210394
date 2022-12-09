public class Kapal extends TransportasiAir {

    protected String mesin;

    Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    
    public void informasi() {
        System.out.printf(
                "Transportasi Air Jenis Kapal Dengan Kursi Berjumlah %d Ditetapkan Dengan Biaya Sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }


    public void berlayar() {
        System.out.printf(
                "Transportasi Air jenis Kapal Sedang Berlayar Menggunakan Mesin %s Dengan Kecepatan Yang Tidak Stabil \n",
                this.mesin);
    }

    public void berlayar(int kecepatan) {
        System.out.printf(
                "Transportasi Air jenis Kapal Sedang Berlayar Menggunakan Mesin %s Dengan Kecepatan Stabil Di Kisaran %d Knot \n",
                this.mesin, kecepatan);
    }


    public void berlabuh() {
        System.out.print("Transportasi Air Jenis Kapal Berlabuh Di Pantai \n");
    }
}
