public class Method{
 
    static void setJudul(){
       System.out.println("M E T H O D");
    }
    
    static int kali(int a, int b){
       return  a*b;
    }
 
    static int bagi(int a, int b){
       return a/b;
    }
    
    static int tambah(int a, int b){
       return a+b;
    }
    
    static int kurang(int a,int b){
       return a-b;
    }    
    
    static int modulus(int a,int b){
       return a%b;
    }    
    
    public static void main(String[] args){
        setJudul();
        System.out.println("Tambah: " + tambah(2,3));
        System.out.println("Kurang: " + kurang(2,3));
        System.out.println("Kali: " + kali(2,3));
        System.out.println("Bagi: " + bagi(2,3));
        System.out.println("Modulus: " + modulus(2,3));
    }
}
