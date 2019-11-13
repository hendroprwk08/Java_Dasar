public class Persegi{ 
    private int panjang; 
    private int lebar;
    
    Persegi(){}
 
    Persegi(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    
    public void setPanjang(int p){ 
        this.panjang = p; 
    } 
    
    public void setLebar(int l){ 
        this.lebar = l; 
    } 
    
    public int getPanjang(){ 
        return panjang; 
    } 
    
    public int getLebar(){ 
        return lebar; 
    } 
    
    public int Luas(){ 
        int luas=panjang*lebar; 
        return luas; 
    }  
}