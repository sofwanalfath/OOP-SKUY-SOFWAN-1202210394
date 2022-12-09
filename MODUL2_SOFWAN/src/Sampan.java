public class Sampan extends TransportasiAir {

    protected int layar;

    Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }


    public void informasi() {
        System.out.printf(
                "Transportasi Air jenis Sampan Dengan Kursi Berjumlah %d Ditetapkan Dengan Biaya Sebesar Rp. %d \n",
                this.jumlahKursi, this.biaya);
    }


    public void berlayar() {
        System.out.printf("Transportasi Air Jenis Sampan Sedang Berlayar Menggunakan %d Layar \n", this.layar);
    }


    public void berlabuh() {
        System.out.print("Transportasi Air Jenis Sampan Berlabuh Di Pantai Tanpa Jangkar \n");
    }

    public void berlabuh(int jangkar) {
        System.out.printf("Transportasi Air Jenis Sampan Berlabuh Di Pantai Menggunakan %d Jangkar \n", jangkar);
    }
}
