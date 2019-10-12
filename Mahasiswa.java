public class Mahasiswa{
    private String nama;
    private String npm;

    public Mahasiswa(String n, String npm) {
        this.nama = n;
        this.npm = npm;
    }
    
    public String tampilkanNama() {
        return nama;
    }
    
    public String tampilkanNpm() {
        return npm;
    }
}