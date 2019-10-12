import java.util.Scanner;

public class InputKeyboard
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);                
        String nama;
        int nilai1, nilai2, pilih;
        
        //clear screen
        System.out.print('\u000C');
        
        System.out.print("Inputkan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Inputkan Nilai 1 : ");
        nilai1 = input.nextInt();
        
        System.out.print("Inputkan Nilai 2 : ");
        nilai2 = input.nextInt();
        
        System.out.println("Penambahan dari nilai 1 dan nilai 2 : "+ (nilai1 + nilai2));
        System.out.println("Nama anda adalah: "+ nama);
    }
}