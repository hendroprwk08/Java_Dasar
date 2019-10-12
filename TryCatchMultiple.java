public class TryCatchMultiple
{
    public static void main (String[] args){
        int num1=5, num2=0;
        int arrNum[]= {1,2,3};

        try {
            int num3=num1/num2;
            System.out.println("The num3 = "+num3);
            System.out.println("The 3 elemen is "+ arrNum[3]);
        }catch(ArithmeticException obj){
                System.out.println("Division by zero");
        }catch(Exception obj) {  
                System.out.println("Other error");
        }
    }
}
