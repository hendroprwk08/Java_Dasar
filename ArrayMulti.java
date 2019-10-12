
/**
 * Pertemuan 4: ArrayMultidimensi here.
 */
public class ArrayMulti
{
    public static void main (String[] args){
        String[][] myArray = {{"Andi", "0815", "Jakarta"}, {"Yuli", "0858", "Bekasi"}, {"Dinata", "0815", "Depok"}};
        
        for(int i = 0; i <= 2 ; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print(myArray[i][j]+" ");
                
                if (j == 2){ 
                    System.out.println();
                }
            }
        }
        
        
    }
}
