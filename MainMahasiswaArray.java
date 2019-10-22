public class MainMahasiswaArray
{
    public static void main(String[] args) {        
        int jumlah = 3; 
        Mahasiswa[] mArray = new Mahasiswa[jumlah]; //definisikan sebagai array
        
        mArray[0] = new Mahasiswa("Devita", "20184350001");
        mArray[1] = new Mahasiswa("Zakiyuddin", "20184350023");
        mArray[2] = new Mahasiswa("Irma", "20184350028");
        
        System.out.println("===== H A S I L =====");
        for (int i = 0; i < jumlah; i++){
            //tanda \t untuk tab
            System.out.println(mArray[i].tampilkanNpm() + "\t" + mArray[i].tampilkanNama());
        }
    }
}
