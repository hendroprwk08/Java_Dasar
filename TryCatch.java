public class TryCatch{
    public static void main(String[] args) {

        int num1 = 5, num2 = 0;
        
        try{
            int num3 = num1 / num2;
            System.out.println("Hasil = " + num3);
        }catch(ArithmeticException e){
            System.out.println("Pesan Kesalahan: "+ e);
        }
    }
}
