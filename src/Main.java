import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
System.out.println("Yarıçapı giriniz");
Scanner y= new Scanner(System.in);
int x=y.nextInt();
Hesaplama hesaplama=new Hesaplama();
hesaplama.r=x;


System.out.println("Dairenin Çevresi: "+hesaplama.cevre());
System.out.println("Dairenin alanı "+hesaplama.alan());





    }
}