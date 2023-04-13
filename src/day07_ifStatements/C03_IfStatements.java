package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Java'da if statement eğer curly brace olmadan yazılırsa şarttan sonraki satır
        if statement ile bağlanır sonraki satırlar ise bağımsız olur.
         */
        int sayi = 20;

        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayı cift");
        }
        if (sayi%5==0){
            System.out.println("5 ile tam bolunur");
        }
    }
}
