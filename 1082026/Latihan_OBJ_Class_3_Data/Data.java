package Latihan_OBJ_Class_3_Data;

public class Data {
    public double celcius;

    public Data(double celcius){
        this.celcius = celcius;
    }

    public double HitungKonversi(){
        return (celcius * 9/5) + 32;
    }

    public double getCelcius() {
        return celcius;
    }
}