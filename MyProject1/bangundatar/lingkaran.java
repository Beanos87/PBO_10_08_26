package bangundatar;

public class lingkaran {
    public int jarijari;

    public void hitungLuas() {
        int hasil =  (22/7) * jarijari * jarijari;
        System.out.println("Luas lingkaran: " + hasil);
    }

    public void hitungKeliling() {
        int hasil = 2 * (22/7) * jarijari;
        System.out.println("Keliling lingkaran: " + hasil);
    }
}
