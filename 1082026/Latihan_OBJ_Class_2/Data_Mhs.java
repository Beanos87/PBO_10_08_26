package Latihan_OBJ_Class_2;

public class Data_Mhs {
    public String nama, nim, jurusan; //<-kayaknya "nim" seharusnya int

    public void tampilkanData(){
        System.out.println("Nama Mahasiswa     : "+nama);
        System.out.println("NIM Mahasiswa      : "+nim);
        System.out.println("Jurusan Mahasiswa  : "+jurusan);
    }

    public static void main(String[] args) {
        Data_Mhs mhs = new Data_Mhs();
        mhs.nama = "Azka Ukail Bahri";
        mhs.nim = "1029384756";
        mhs.jurusan = "PPLG";

        mhs.tampilkanData();
    }
}