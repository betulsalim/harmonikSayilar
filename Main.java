import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi;
        float toplam =0,i;
        Scanner input = new Scanner (System.in);

        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();
        for (i=1;i<=sayi;i++){
            toplam = (float) toplam +(1/i);
        }
        System.out.println("Toplam: "+toplam);
    }
}
