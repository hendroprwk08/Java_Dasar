import javax.swing.*;

class Bilangan 
{
    private int data;

    public void inputData()
    {
        String teks = JOptionPane.showInputDialog("Masukan Angka:");
        data = Integer.parseInt(teks);
    
    }
    
    public void displayData()
    {
        System.out.println("Bilangan "+this.data);
    }
}

//kelas pengendali
public class BilanganInputJSwing
{
    public static void main (String[]args)
    {
        Bilangan bilangan1 = new Bilangan();
        //memasukan data
        bilangan1.inputData();
        bilangan1.displayData();
        
        System.exit(0);    
    }
}