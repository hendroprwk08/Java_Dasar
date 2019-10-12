public class MainMahasiswa{

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Intan", "53410572");
        System.out.println("Nama \t : " + m.tampilkanNama());
        System.out.println("NPM \t : " + m.tampilkanNpm());
    }
}