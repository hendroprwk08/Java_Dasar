import java.util.Scanner;

public class PojoOperation
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama, nim;
        
        System.out.print("Nama: ");
        nama = input.nextLine();
        
        System.out.print("Nim: ");
        nim = input.nextLine();
        
        Mahasiswa m = new Mahasiswa(nama, nim);
        
        System.out.println(m.tampilkanNama());
        System.out.println(m.tampilkanNpm());
    }
}
