public class MainConstructorPolymorphism{

    public static void main(String[]args)
    {
        Karyawan Kar1 = new Karyawan(171234,"Andi","Jln Tamrin");        
        //menampilkan data
        System.out.println ("Nomor Karyawan : "+ Kar1.noKar);
        System.out.println ("Nama Karyawan : "+ Kar1.nama);
        System.out.println ("Alamat karyawan : "+ Kar1.alamat);
        
        Karyawan Kar2 = new Karyawan();
        System.out.println ("Nomor Karyawan : "+ Kar2.noKar);
        System.out.println ("Nama Karyawan : "+ Kar2.nama);
        System.out.println ("Alamat karyawan : "+ Kar2.alamat);
        
        Karyawan Kar3 = new Karyawan("Jokowi");
        System.out.println ("Nomor Karyawan : "+ Kar3.noKar);
        System.out.println ("Nama Karyawan : "+ Kar3.nama);
        System.out.println ("Alamat karyawan : "+ Kar3.alamat);
    }
}

class Karyawan
{
    int noKar;
    String nama, alamat;
    
    Karyawan(int k, String n, String a)
    { 
        this.noKar= k;
        this.nama = n;
        this.alamat = a; 
    }
    
    //konstruktor tanpa parameter
    Karyawan(){}
    
    //konstruktor dengan satu parameter
    Karyawan(String n)
    {
        this.nama = n;
    }
}
