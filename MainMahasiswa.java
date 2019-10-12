public class MainMahasiswa{

    public static void main(String[] args) {
        Mahasiswa Intan = new Mahasiswa("Intan", "53410572");
        System.out.println("Nama \t : " + Intan.tampilkanNama());
        System.out.println("NPM \t : " + Intan.tampilkanNpm());
        Intan.JK();
        Intan.kelas();
        Intan.MK();
        Intan.Kampus();
        System.out.println();
    }
}