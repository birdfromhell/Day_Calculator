import main.fungsi.function;
import main.fungsi.* ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        function fungsi = new function();
        Minggu minggu = new Minggu();
        bulan Bulan = new bulan();
        tahun Tahun = new tahun();

        Scanner scan = new Scanner(System.in);

        int input1 = 0;
        int input2 = 0;
        int input3 = 0;
        int input4 = 0;

        System.out.println("1.Minggu");
        System.out.println("2.Bulan");
        System.out.println("3.Tahun");
        System.out.println("4.Hari");
        System.out.println("Pilih = ");
        int jawab1 = scan.nextInt();

        switch (jawab1) {
            case 1 :
                System.out.println("Masukan Minggu : ");
                input1 = scan.nextInt();
                break;
            case 2 :
                System.out.println("Masukan Bulan : ");
                input2 = scan.nextInt();
                break;
            case 3 :
                System.out.println("Masukan Tahun : ");
                input3 = scan.nextInt();
                break;
            case 4 :
                System.out.println("Masukan Hari : ");
                input4 = scan.nextInt();
            default:
                System.out.println("Input Salah!!!");
        }

       switch (jawab1) {
            case 1 :
                System.out.println( input1 + " Minggu " + " = " + Minggu.hari(input1) + " Hari ");
                System.out.println( input1 + " Minggu " + " = " + Minggu.bulan(input1) + " Bulan ");
                break;
            case 2 :
               System.out.println( input2 + " Bulan " + " = " + Bulan.hari(input2) + " Hari ");
               System.out.println( input2 + " Bulan " + " = " + Bulan.minggu(input2) + " Minggu ");
               break;
             case 3 :
               System.out.println( input3 + " Tahun " + " = " + Tahun.hari(input3) + " Hari ");
               System.out.println( input3 + " Tahun " + " = " + Tahun.minggu(input3) + " Minggu ");
               System.out.println( input3 + " Tahun " + " = " + Tahun.bulan(input3) + " Bulan ");
        }


    }
}
