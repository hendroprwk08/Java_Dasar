public class Balok extends Persegi{ 
    private int tinggi; 
    
    Balok(int t){
        this.tinggi = t;
    }
    
    public void setTinggi(int t){ 
        this.tinggi = t; 
    } 
    
    public int getTinggi(){ 
        return tinggi; 
    } 
    
    public int Volume(){ 
        int v = getPanjang() * getLebar() * tinggi; 
        return v; 
    } 
} 