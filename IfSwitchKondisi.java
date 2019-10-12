import java.util.Scanner;

/**
 * Write a description of class IfKondisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IfSwitchKondisi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int usia = 0, bulan = 0;
        
        System.out.print('\u000C'); //clear screen
        
        System.out.print("Berapa usiamu? ");
        usia = input.nextInt();
        
        if(usia > 1 && usia <= 5){
            System.out.println("Balita");
        }else if(usia > 5 && usia <= 18){
            System.out.println("Anak-anak");
        }else if(usia > 18 && usia <= 23){
            System.out.println("Remaja");
        }else if(usia > 23 && usia <= 35){
            System.out.println("Dewasa");
        }else if(usia > 35 && usia <= 60){
            System.out.println("Mapan");
        }else if(usia > 60){
            System.out.println("Lansia");
        }else{
            System.out.println("Maaf tak ada kategori untuk Anda");
        }
        
        System.out.print('\u000C'); //clear screen
        
        System.out.print("Masukkan angka hari : ");
        usia = input.nextInt();
        
        switch(usia){
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default :
                System.out.println("Kriteria salah");
                break;
        }
    }
}
