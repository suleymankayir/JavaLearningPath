package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseStatementsPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen carpim yapılacak 2 sayıyı yazınız.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 && sayi2<0){
            System.out.println((sayi1*sayi2));
        } else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)){
            System.out.println("Farklı isaretli sayıilarla islem yapamazsın.");
        } else if ((sayi1 == 0) || (sayi2 == 0)){
            System.out.println("Sıfır carpmaya göre yutan elemandır");
        }
    }
}
