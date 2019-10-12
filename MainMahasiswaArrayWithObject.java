import java.util.Scanner;

public class MainMahasiswaArrayWithObject{
    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Jumlah data: ");
        int jumlah = in.nextInt(); 
            
        Mahasiswa[] mArray = new Mahasiswa[jumlah]; //definisikan sebagai array
        
        in.nextLine(); //mengindari nextInt yang tak mengcapture Int sebelumnya
        String nama,npm;
        for (int i = 0; i < jumlah; i++){
            System.out.println("===== DATA KE-" + (i + 1) + " ====="); 
            System.out.print("NPM: ");
            npm = in.nextLine();
            System.out.print("Nama: ");
            nama = in.nextLine();
            mArray[i] = new Mahasiswa(nama, npm);
        }
        
        System.out.println("===== H A S I L =====");
        for (int i = 0; i < jumlah; i++){
            //tanda \t untuk tab
            System.out.println(mArray[i].tampilkanNpm() + "\t" + mArray[i].tampilkanNama());
        }
    }
}