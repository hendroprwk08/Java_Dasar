/* 
 * Pertemuan 03: Construct
 */
class Const00
{
    //static final double pi = 3.14;
    
    //construktor kelas yang dijalankan pertama kali saat aplikasi dijalankan
    Const00(){
        }
    
    //metode untk menghitung luas lingkaran 
    double hitungLuas(int radius)
    {
        return 3.14 * (radius * radius);
    }
    

    public static void main (String[]args)
    {
        Const00 lingk = new Const00();
        
        //menampilkan Luas objek
        System.out.println(" Luas Lingkaran = " + lingk.hitungLuas(3));
    }
}