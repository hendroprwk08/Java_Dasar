class Induk{
    public void panggilAku(){
        System.out.println("Hallo, ini CLASS INDUK yang dipanggil");
    }
}

class Anak extends Induk{
    //method sama dengan method induk atau override
    public void panggilAku(){
        System.out.println("Hallo, ini CLASS ANAK yang dipanggil");
    }
}

public class MainOverriding{
    public static void main(String args[]){
        Induk i = new Induk();
        Anak a = new Anak();
        
        System.out.print("\u000C");
        i.panggilAku();
        a.panggilAku();
    }
}