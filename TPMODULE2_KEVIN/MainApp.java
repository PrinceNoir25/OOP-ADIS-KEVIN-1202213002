public class MainApp {
    //main class
    public static void main(String[]args ) {
        Perangkat Perangkat = new Perangkat(null,0,0);
        Handphone hp = new Handphone("seagate",6,2,true);
        hp.drive="Seagate";
        hp.ram = 6;
        hp.processor = 2;
        hp.fingerprint = true;

        Laptop laptop = new Laptop("samsung",16,9,false);
        laptop.drive="samsung";
        laptop.ram = 16;
        laptop.processor = 9;
        laptop.webcam = false;

        Perangkat.informasi();
        System.out.println();

        hp.informasi();
        hp.telfon(59389843);
        hp.kirimSMS(838838);
        hp.kirimSMS(39494,49494);

        laptop.informasi();
        laptop.bukaGame("GOD OF WARRRRRRRRR");
        laptop.kirimEmail("uqbuebufbeukdb@gmail.com");
        laptop.kirimEmail("bfywegfgewiufuf@gmail.com", "uieriebguie@gmail.com");
        

    }
    
}
