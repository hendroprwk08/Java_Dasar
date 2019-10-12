/* 
 * Pertemuan 03: Construct
 */
class ConstLingkaran
{
    static final double pi = 3.14;
    double radius;
    String warna;

    //construktor kelas yang dijalankan pertama kali saat aplikasi dijalankan
    ConstLingkaran (double r, String w){
        this.radius = r;
        this.warna = w;
    }
    
    //metode untk menghitung luas lingkaran 
    double hitungLuas()
    {
        return pi * radius * radius;
    }
    
    String warna()
    {
        return this.warna;
    }

    public static void main (String[]args)
    {
        ConstLingkaran lingk = new ConstLingkaran(23.8, "Merah");
        
        //menampilkan Luas objek
        System.out.println(" Luas Lingkaran = " + lingk.hitungLuas());
        System.out.println(" WarnaLingkaran =" + lingk.warna);
    }
}