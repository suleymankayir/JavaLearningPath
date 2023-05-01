package day18_While_doWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        int sayi = 7;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi < 10);


    }
}
