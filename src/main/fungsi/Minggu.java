package main.fungsi;

public class Minggu {

int minggu = 7 ;
    public static float hari(float hari){

         return hari * 7 + 2;
    }
    static int Bulan = 30 ;
    public static float bulan(float bulan){
    float cek = bulan * 7 + 2 ;

        return cek / Bulan ;
    }
}
