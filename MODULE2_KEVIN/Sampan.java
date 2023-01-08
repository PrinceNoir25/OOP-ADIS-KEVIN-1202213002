public class Sampan extends TransportasiAir{
    protected int layar;//attribute

    //constructor
    public Sampan (int jumlahKursi,int biaya,int layar){
        super(jumlahKursi,biaya);
        this.layar = layar;
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi "+jumlahKursi+" Ditetapkan dengan biaya sebesar "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis sampan berlabuh dipantai tanpa jangkar");
    }
    public void jangkar(int jangkar){
        System.out.println("Transportasi air jenis sampan berlabuh dipantai menggunakan "+jangkar+" Jangkar");
    }
}