import java.util.Scanner;

public class LoopBreakTebakAngka{
    public static void main(String[] args) {
        int tebak, angkaTersimpan = 6;
        Scanner input = new Scanner(System.in);
        
            
        for (int i = 0; i <= 5; i++) {
            
            System.out.print("Tebak Angka! antara 0 hingga 9: ");
            tebak = input.nextInt();
        
            if (tebak == angkaTersimpan) {
                System.out.println("Yap. kamu benar");
                break;
            }else{
                System.out.println("Salah. coba lagi.");
            }
        }
    }
}
