import java.util.Scanner;

public class ContinueTanpaNegatif
{
    public static void main(String[] args) {
    
        int angka, sum = 0;
        Scanner input = new Scanner(System.in);
    
        for(int i = 1; i < 6; ++i) {
          System.out.print("Enter number " + i + " : ");
          angka = input.nextInt(); 
    
          if (angka <= 0) { //jika negatif, maka skip
            continue;
          }
    
          sum += angka;
        }
    
        System.out.println("Sum = " + sum);
        input.close();
    }
}
