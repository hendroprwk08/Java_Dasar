class Shape {
    protected String bentuk;
    protected double luas;
    
    public void setBentuk(String bentuk)
    {
        this.bentuk = bentuk;
    }
    
    public String getBentuk()
    {
        return this.bentuk;
    }
    
    public double getLuas()
    {
        double p = 3;
        double l = 4;
        double proses = p * l;
        return proses;
    }
}

public class Segitiga extends Shape
{
    private double alas;
    private double tinggi;
    
    public void setTinggi(double tinggi)
    {
        this.tinggi = tinggi;
    }
    public double getTinggi()
    {
        return this.tinggi;
    }
    public void setAlas(double alas)
    {
        this.alas = alas;
    }
    public double getAlas()
    {
        return this.alas;
    }
    public double getLuas()
    {
        this.luas = 0.5 * this.alas * this.tinggi;
        return this.luas;
    }
    
    public static void main(String args[])
    {
        Segitiga st = new Segitiga();
        st.setBentuk("Segitiga");
        st.setTinggi(5);
        st.setAlas(4);
        System.out.println("Bentuk : "+st.getBentuk());
        System.out.println("Tinggi : "+st.getTinggi());
        System.out.println("Alas : "+st.getAlas());
        System.out.println("Luas : "+st.getLuas());
    }
}