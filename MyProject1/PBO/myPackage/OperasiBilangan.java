package myPackage;

public class OperasiBilangan {
    public int bilPertama;
    public int bilKedua;

    public void hitungPenjumlahan() {
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }

    public void hitungPengurangan() {
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }

    public void hitungPerkalian() {
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil perkaliannya: " + hasil);
    }

    public void hitungPembagian() {
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil pembagiannya: " + hasil);
    }
}