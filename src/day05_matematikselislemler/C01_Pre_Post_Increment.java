package day05_matematikselislemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1;
        sayi2 +=5 ;
        int sayi3 = sayi2++; // post-increment(sayi3 değeri 1 artmayacak sadece sayi2 değerini
        // alacak ancak sayi2 1 artacak)
        System.out.println(sayi3);
        System.out.println(sayi2);
        int sayi4 = ++sayi1; // pre-increment (burda ise eşitliğin sağ tarafında soldan başlandığı için
        // sayı1 değeri 1 artarak sayi4 değeri atanacak.)
        System.out.println(sayi4);

    }
}
