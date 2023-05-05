package practise;

import java.util.Scanner;

public class Q9_KelimeSayaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scan.nextLine();

        int kelimeSayisi = 0;

        boolean kelimeVar = false;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) != ' ') {
                kelimeVar = true;

            } else if (kelimeVar) {
                kelimeSayisi++;

                kelimeVar = false;
            }
            System.out.println(kelimeVar);
        }

        if (kelimeVar) {
            kelimeSayisi++;
        }

        System.out.println("Metindeki kelime sayısı: " + kelimeSayisi);
    }
}
/*
Kullanıcıdan metin girişi alınır ve metin değişkenine atanır.
kelimeSayisi ve kelimeVar değişkenleri sıfırlanır.
for döngüsü başlatılır ve i değişkeni 0'dan metin değişkeninin uzunluğuna kadar arttırılır.
if bloğu ile metin karakter dizisindeki her karakter kontrol edilir.
Eğer karakter bir boşluk karakteri değilse, kelimeVar değişkeni true olarak ayarlanır.
Bu, bir kelimenin başlangıcını tespit eder.
Eğer karakter bir boşluk karakteri ise, else if bloğu çalışır ve
kelimeVar değişkeninin true olup olmadığı kontrol edilir.
Eğer kelimeVar true ise, bir kelimenin sona erdiği anlaşılır ve kelimeSayisi değişkeni artırılır.
Ayrıca, bir sonraki kelimenin başlangıcını tespit etmek için kelimeVar değişkeni false olarak ayarlanır.
if bloğu, son karakter bir boşluk karakteri olmadığı için,
döngüden çıkıldığında kelimeVar değişkeni hala true olabilir.
Bu, son kelimenin sona ermediği anlamına gelir.
Bu durumda, if bloğu ile kontrol edilir ve kelimeVar true ise, son kelimeyi de kelimeSayisi değişkenine ekler.
Son olarak, kelimeSayisi değişkeninin değeri ekrana yazdırılır.
 */