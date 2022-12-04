public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("FeastFix", 24, 5.6f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(false, "Mito", 8, 4.6f);
        hp.informasi();
        hp.telfon(85777);
        hp.kirimSMS(928357);
        hp.manyMessage(65932, 23556);

        System.out.println();

        Laptop laptop = new Laptop("Sumsang", 16, 5.0f, false);
        laptop.informasi();
        laptop.bukaGame("Point Blank");
        laptop.kirimEmail("Sofwanalfath@gmail.com");
        laptop.multiEmail("sofwanalfath@gmail.com", "sofwanmuvic@gmail.com");
    }
}