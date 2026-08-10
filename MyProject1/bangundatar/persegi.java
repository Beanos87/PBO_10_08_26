package bangundatar;

public class persegi {
    public int sisi;

    public void hitungLuas() {
        int hasil =  sisi * sisi;
        System.out.println("Luas persegi: " + hasil);
    }

    public void hitungKeliling() {
        int hasil = 2 * (4 * sisi);
        System.out.println("Keliling persegi: " + hasil);
    }
}
