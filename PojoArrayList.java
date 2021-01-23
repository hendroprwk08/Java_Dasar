import java.util.Scanner;
import java.util.ArrayList;

public class PojoArrayList
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlah;
        String nama, nim;
        
        ArrayList<Mahasiswa> mhs = new ArrayList();
        
        System.out.print("Jumlah data: ");
        jumlah = input.nextInt();
        
        System.out.println("====================");
        input.nextLine(); //skip error Scanner
        for(int i = 0; i < jumlah; i++){
            System.out.println("Data ke-"+ i);
            System.out.print("Nama: ");
            nama = input.nextLine();
            
            System.out.print("Nim: ");
            nim = input.nextLine();
            
            //tambahkan kedalam arraylist
            mhs.add( new Mahasiswa( nama, nim ) );
            
            System.out.println();
        } 
        
        System.out.println("========================");
        
        for(int i = 0; i < jumlah; i++){
            System.out.printf("| %-11s| %-8s|", 
            mhs.get(i).tampilkanNama(),
            mhs.get(i).tampilkanNpm() );
            System.out.println( );
        }
        
        System.out.println("========================");
    }
}
