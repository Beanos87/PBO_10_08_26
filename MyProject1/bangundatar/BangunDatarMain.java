package bangundatar;

public class BangunDatarMain {
    public static void main(String[] args) {
        persegiPanjang perpan = new persegiPanjang() ;
        perpan.panjang = 25 ;
        perpan.lebar = 38 ;
        perpan.hitungLuas();
        perpan.hitungKeliling();

        persegi pergi = new persegi() ;
        pergi.sisi = 10 ;
        pergi.hitungLuas();
        pergi.hitungKeliling();
        pergi.sisi = 15 ;
        pergi.hitungLuas();
        pergi.hitungKeliling();

        lingkaran ling = new lingkaran() ;
        ling.jarijari = 25 ;
        ling.hitungLuas();
        ling.hitungKeliling();
        ling.jarijari = 37 ;
        ling.hitungLuas();
        ling.hitungKeliling();
    }
}
