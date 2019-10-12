/*
 * Pertemuan 02b: Aritmatika dengan OOP
 */

class ProgramUtamaAritmatika
{
   public static void main(String[] args){
      int x=10;
      int y=2;
  
      AritmatikaOOP AOOP = new AritmatikaOOP();
  
      System.out.println("Operasi kali "+AOOP.kali(x,y));
      System.out.println("Operasi bagi "+AOOP.bagi(x,y));
      System.out.println("Operasi tambah "+AOOP.tambah(x,y));
      System.out.println("Operasi kurang "+AOOP.kurang(x,y));
    }
}