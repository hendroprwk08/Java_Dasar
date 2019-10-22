public class Mahasiswa{
    private String nama;
    private String npm;

    public Mahasiswa(String n, String p) {
        this.nama = n;
        this.npm = p;
    }
    
    public String tampilkanNama() {
        return nama;
    }
    
    public String tampilkanNpm() {
        return npm;
    }
}