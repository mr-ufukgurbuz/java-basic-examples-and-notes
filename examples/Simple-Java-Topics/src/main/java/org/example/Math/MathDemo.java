package org.example.Math;

/*
    MATH CLASS

    Java dilinde kullanılan standart  java sınıfılarından birisidir. Bu sınıfın en büyük özelliği
    java.lang paketinin içinde olması. Bu paketin dışında olan tüm paketlerı import deyimi ile çağırmamız gerekiyor.

    Math sınıfında 2 adet sabit tanımlanmıştır:

    Math.PI : 3.14.... public static final double PI olarak tanımlanır.

    Math.E : 2.71 .... public static final double E olarak tanımlanır.

    Math Sınıfına ait birkaç metot;

    Abs(x) : x değişkeninin mutlak değeri

    Ceil(x) : x değişkenini bir üst tam sayıya dönüştürür. Math.ceil(8.3) = 9 gibi.

    Sin(x) : x in trigonometrik sinusu (x in radyan cinsindendir.)

    Tan(x) , Acos(x) , Asin(x) , Atan(x) trigonometrik işlemler için kullanılır.

    exp(x) : x in  kuvvetlerını hesaplanmadı kullanılır.

    Pow(x,y): x in y ninci kuvveti

    sqrt(x) : x in karekökü

    Max(x,y) ve Min(x,y) büyük ve küçük değer için kullanılır.

    Random() : Rastgele sayı üretmek için kullanılır.
*/
public class MathDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            // random sayi uretmek icin kullanilir
            // belli degerler arasinda uretmek icin Math.random()*10 seklinde kullanilir
            System.out.println(1 + (int)(Math.random() * 20)+"\t");
        }
        // ****************************************
        // Dik kenarlari x olan ikizkenar bir ucgenin alanini hesaplayalim?
        double k, Alan;
        k = 5;
        System.out.println("x kenar uzunlugu : " + k);
        Alan = Math.pow(k,2)/2;
        System.out.println("Alan = " + Alan);
        // ****************************************
        // 0 ile 50 arasinda rastgele uretilen 2 sayisidan buyugunu once ekrana yazdiran bir uyg.
        int a, b;

        a = (0 + (int)(Math.random() * 50));
        System.out.println("x = " + a);

        b = (0 + (int)(Math.random() * 50));
        System.out.println("y = " + b);
        System.out.println(Math.max(a, b) + " " + Math.min(a, b));
        // ****************************************
        int x = 7 , y = -6;

        double z = 35.6, t = 0.4;

        System.out.println("y nin mutlak degeri : " + Math.abs(y));

        System.out.println("z nin sayisini yuvarlayalim : " + Math.round(z));

        System.out.println("t nin sayisini yuvarlayalim : " + Math.round(t));

        System.out.println("z nin sayisini ust sayiya yuvarlayalim : " + Math.ceil(t));

        System.out.println("z nin sayisini alt tamsayiya yuvarlayalim : " + Math.floor(z));

        System.out.println("x - y  sayilarindan buyuk olani gosterelim : " + Math.max(x,y));

        System.out.println("z - t  sayilarindan kucuk olani gosterelim : " + Math.min(z,t));

        System.out.println("t'nin arcsinusunu gosterelim : " + Math.asin(t));

        double aci = Math.toRadians(45);

        System.out.println("45 in cos degeri : " + Math.cos(aci));

        System.out.println("45 in sin degeri : " + Math.sin(aci));
    }
}
