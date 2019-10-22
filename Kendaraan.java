public class Kendaraan
{
    String jenis, merek;
    int cc;
    
    void setJenis(String j){
        this.jenis = j;
    }

    void setMerek(String m){
        this.merek = m;
    }
        
    void setCc(int c){
        this.cc = c;
    }
    
    String getJenis(){
        return this.jenis;
    }

    String getMerek(){
        return this.merek;
    }
        
    int getCc(){
        return this.cc;
    }
}
