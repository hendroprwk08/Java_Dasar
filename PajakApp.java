class PajakApp{
public static void main(String[]args){
pajak t = new pajak();
t.pendapatan = 500000;
t.provinsi = "Kalimantan Timur";
double pajakAnda = t.hitungPajak();
PajakKaltim t1 = new PajakKaltim();
double pajakAndaDaerah = t1.hitungPajakDaerah(pajakAnda);

// menampilkan hasil
System.out.println("pajak Anda " + pajakAnda);
System.out.println("Tempat tinggal Anda" + t.provinsi);
System.out.println("Pajak anda dengan potongan"+ pajakAndaDaerah);
}
}
