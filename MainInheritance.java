/**
 * Pewarisan atau Inheritance
*/

public class MainInheritance
{
    public static void main(String args[]){ 
        System.out.print("\u000C"); 
        
        Persegi a = new Persegi(5, 5);
        System.out.println("========= INHERITANCE ( PEWARISAN )=========="); 
        System.out.println("Superclass PersegiPanjang"); 
        System.out.println(" Panjang  : " + a.getPanjang()); 
        System.out.println(" Lebar  : " + a.getLebar()); 
        System.out.println(" Luas  : "+ a.Luas()); 
        System.out.println(""); 
 
        /* kelas balok tinggal memanggil method yang ada didalam kelas persegi */
        Balok b = new Balok(5);  
        b.setPanjang(4); 
        b.setLebar(3); 
        System.out.println("Subclass Balok"); 
        System.out.println(" Panjang  : " + b.getPanjang()); 
        System.out.println(" Lebar  : " + b.getLebar()); 
        System.out.println(" Tinggi  : "+ b.getTinggi()); 
        System.out.println(" Volume  : "+ b.Volume()); 
    }
}
