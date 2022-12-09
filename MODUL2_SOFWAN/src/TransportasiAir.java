public class TransportasiAir {

    protected int jumlahKursi;
    protected int biaya;

    TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi() {
        System.out.printf(
                "Transportasi Air Jenis Tidak Diketahui Dengan Kursi Berjumlah %d Ditetapkan Dengan Biaya Sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }

    public void berlayar() {
        System.out.print("Transportasi Air Dengan Jenis Yang Tidak Diketahui Sedang Berlayar \n");
    }

    public void berlabuh() {
        System.out.print("Transportasi Air Dengan Jenis Yang Tidak Diketahui Berlabuh Di Pantai \n");
    }

}