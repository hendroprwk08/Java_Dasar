public class Hasil_no_1
{
public static void main(String[]args){
BerhitungDesimal bd = new BerhitungDesimal();
BerhitungPecahan bp = new BerhitungPecahan();
 
int a = 0 +4 ;
double b = 7 + 2;
int xx = bd.hitung(a,3,(int)b) + bd.hitung(a,5);
int yy = bd.hitung(bd.hitung(4,2),bd.hitung(a, 2,1));
double zz = bp.hitung(a, b ,5) + bd.hitung((int)b,xx);

System.out.println(xx);
System.out.println(yy);
System.out.println(zz * xx + yy);
System.out.println(zz+xx);
System.out.println("final :" +zz+yy+xx);
}
}
