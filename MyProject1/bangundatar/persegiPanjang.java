package bangundatar;

public class persegiPanjang {
    public int panjang;
    public int lebar;

    public void hitungLuas() {
        int hasil =  panjang * lebar;
        System.out.println("Luas persegi panjang: " + hasil);
    }

    public void hitungKeliling() {
        int hasil = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + hasil);
    }
}
