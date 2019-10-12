import java.util.Scanner;

public class ArrayInputBanyakNilaiSatuJenis
{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jinput;
        String inNama;
     
        System.out.print("\u000C");
        
        System.out.print("Masukkan jumlah data yang Anda inginkan : ");
        jinput = input.nextInt();
        
        String[] namas = new String[jinput];
        System.out.println("Jumlah data: "+ namas.length);
        
        System.out.print("Ketik " + jinput +" temanmu");
        /*for(int i = 0; i < namas.length; i++){
            System.out.println("Teman ke-"+ i + ": ");    
            namas[i] = input.nextLine();
        }*/
        
        int i = 0;
        while(i < jinput){
            System.out.println("Teman ke-"+ i + ": ");    
            namas[i] = input.nextLine();
            i++;
        }
        
        System.out.print("\u000C");
        
        for(String n : namas){
            System.out.println(n);
        }
        
        System.exit(0);    
    }
}
