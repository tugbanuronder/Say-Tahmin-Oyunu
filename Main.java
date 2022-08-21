import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Random random= new Random();
        int number=random.nextInt(100);

        System.out.println("Merhaba! Sayı tahmin oyunumuza hoşgeldiniz.\nSayıyı tahmin etmek için 5 hakkınız bulunmaktadır.\nBaşarılar :)");

        Scanner input= new Scanner(System.in);

        int[] arr= new int[5];
        boolean isWin=false;
        int right=0;

        while(right<5) {

            System.out.print("Tahmininizi giriniz :");
            int predicted = input.nextInt();

            if(predicted<0 || predicted>100){

                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                arr[right]=predicted;
                right++;
            }
            if(predicted<number){

                System.out.println("Hatalı tahmin!\nTahmininiz sayıdan küçüktür.");
                arr[right]=predicted;
                right++;
            }
            if(number==predicted){

                System.out.println("Tebrikler doğru tahmin!");
                System.out.println("Tahmininiz :" + predicted);
                arr[right]=predicted;
                isWin=true;
                break;
            }
            if(predicted>number){

                System.out.println("Hatalı tahmin!\nTahmininiz sayıdan büyüktür.");
                arr[right]=predicted;
                right++;
            }

            System.out.println("Kalan Hakkınız :" + (5-right));
        }

        if(!isWin){

            System.out.println("Kaybettiniz.");
            System.out.println("Tahminleriniz : " + Arrays.toString(arr));
            System.out.println("Tahmin edilecek sayı " + number + " idi.");
        }
    }
}