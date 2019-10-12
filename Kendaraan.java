public class Kendaraan
{
    String jenis, merek;
    int cc;
    
    public void setJenis(String j){
        this.jenis = j;
    }

    public void setMerek(String m){
        this.merek = m;
    }
        
    public void setCc(int c){
        this.cc = c;
    }
    
    public String getJenis(){
        return this.jenis;
    }

    public String getMerek(){
        return this.merek;
    }
        
    public int getCc(){
        return this.cc;
    }
}
