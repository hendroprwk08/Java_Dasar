import java.util.Scanner;

public class PojoArrayList
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlah;
        String nama, nim;
        
        Arraylist<
        System.out.print("Nama: ");
        nama = input.nextLine();
        
        System.out.print("Nim: ");
        nim = input.nextLine();
        
        Mahasiswa m = new Mahasiswa(nama, nim);
        
        System.out.println(m.tampilkanNama());
        System.out.println(m.tampilkanNpm());
    }
}
