package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_SortingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin");
        int diziBoyutu = scan.nextInt();

        int[] dizi = new int[diziBoyutu];
        for (int i = 0; i <diziBoyutu ; i++) {
            System.out.println((i+1) + ". sayıyı girin");
            dizi[i] = scan.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Sıralanmış dizi " + Arrays.toString(dizi));
    }
}
