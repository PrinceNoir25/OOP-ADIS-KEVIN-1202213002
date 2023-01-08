public class MainApp {
    //main class
    public static void main(String[]args){
        Kapal kpl = new Kapal(10,10000,"HONDAAAAA MERCY");
        Sampan spn = new Sampan(4,8,100);
        
        System.out.println(kpl);
        System.out.println(spn);

        kpl.informasi();
        kpl.berlayar(90);
        kpl.berlabuh();
        kpl.berlayar();

        spn.informasi();
        spn.jangkar(8);
        spn.berlayar();
        spn.berlabuh();
    }
}
