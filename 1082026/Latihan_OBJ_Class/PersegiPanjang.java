package Latihan_OBJ_Class;

public class PersegiPanjang {
    double panjang, lebar;

    //fungsi hitung luas
    double hitungLuas(){
        return panjang * lebar;
    }

    //fungsi hitungKeliling
    double hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}