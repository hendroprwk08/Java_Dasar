/*
 * Pertemuan 3a: Construct dan Overloading
 */

public class Karyawan
{
    private int noKar;
    private String nama, alamat;
    
    public Karyawan(int k, String n, String a)
    {
        this.noKar= k;
        this.nama = n;
        this.alamat = a; 
    }
    
    //konstruktor tanpa parameter
    public Karyawan(){}
    
    //konstruktor dengan satu parameter
    public Karyawan(String n)
    {
        this.nama = n;
    }
    
    public static void main(String[]args)
    {
        Karyawan Kar1 = new Karyawan(171234,"Andi","Jln Tamrin");
        Karyawan Kar2 = new Karyawan();
        Karyawan Kar3 = new Karyawan("Jokowi");
        
        //menampilkan data
        System.out.println ("Nomor Karyawan : "+ Kar1.noKar);
        System.out.println ("Nama Karyawan : "+ Kar1.nama);
        System.out.println ("Alamat karyawan : "+ Kar1.alamat);
        
        System.out.println ("Nomor Karyawan : "+ Kar2.noKar);
        System.out.println ("Nama Karyawan : "+ Kar2.nama);
        System.out.println ("Alamat karyawan : "+ Kar2.alamat);
        
        System.out.println ("Nomor Karyawan : "+ Kar3.noKar);
        System.out.println ("Nama Karyawan : "+ Kar3.nama);
        System.out.println ("Alamat karyawan : "+ Kar3.alamat);
    }
}