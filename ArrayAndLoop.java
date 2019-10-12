/**
 * Pertemuan 4: Array
 */

public class ArrayAndLoop
{
    // instance variables - replace the example below with your own
    
    public static void main (String[]args){
       int myArray[] = {1, 2, 3, 4, 5, 6};
       int i;
        
       System.out.println("=== F O R === ");
       for(i = 0; i <= 5; i++){
           System.out.println(myArray[i]);
       }
       
       System.out.println("=== W H I L E === ");
       i = 0;
       while(i <= 5){
           System.out.println(i);
           i++;
       }
       
       System.out.println("=== DO W H I L E === ");
       i = 0;
       do{
           System.out.println(i);
           i++;
       }
       while(i <= 5);
        
       System.out.println("=== A R R A Y === ");
       String[] mahasiswas = {"anto", "Angga", "Rina", "Desta"};
       for(String m : mahasiswas) {
           System.out.println(m);
       }
        
       System.out.println("=== M O D U L U S === ");
       //array menmapilkan modulus tak dapat dibagi dua
       int jumlah = 0;
       for(i = 0; i <= 20; i++){
           if ((i % 2) == 1){
               jumlah += i;
               System.out.println(i);
           }
       }
       System.out.println("JUMLAH: " + jumlah);
       
    }
}
