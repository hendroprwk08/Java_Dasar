class pajak
{
double pendapatan;
String provinsi;
public double hitungPajak()
{
double pajakUmum = 0;
if (pendapatan < 300000)
{
pajakUmum = pendapatan * 0.05;
}
else
{
pajakUmum = pendapatan * 0.06;
}
return pajakUmum;
}
}
