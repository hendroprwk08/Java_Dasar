public class MainKendaraan
{
    public static void main(String[] args)
    {
        Kendaraan k = new Kendaraan();
        
        k.setMerek("Honda Jazz");
        k.setJenis("Mobil");
        k.setCc(1200);
        
        System.out.println("Merek: " + k.getMerek());
        System.out.println("Jenis: " + k.getJenis());
        System.out.println("CC: " + k.getCc());
    }
}
