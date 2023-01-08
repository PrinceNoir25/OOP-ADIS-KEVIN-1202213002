public class Kapal extends TransportasiAir {
    protected String mesin;//Attribute

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi,biaya );
        this.mesin = mesin;
        this.biaya = biaya;
        this.jumlahKursi = jumlahKursi;
    }
    //method
    @Override
    public void informasi(){
        System.out.println("Tranportasi Air jenis "+mesin+" dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis "+mesin+" sedang berlayar dengan kecepatan tidak stabil");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis "+mesin+" berlabuh di pantai");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+mesin+"dengan kecepatan stabil di kisaran "+kecepatan+" knot");
    }
}
