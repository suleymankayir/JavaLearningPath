package practise;

import java.util.Scanner;

public class Q10_YildizDeseni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satır sayisini giriniz");
        int satirSayisi = scan.nextInt();

        for (int i = 0; i <=satirSayisi ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
