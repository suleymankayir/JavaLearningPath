package day07_ifStatements;

public class C01_AndOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>=b); // true
        System.out.println(a<0 && b<20 && c>=b); // false java ilki yanlış olunca gerisine bakmaz
        System.out.println(a<0 & b<20 & c>=b); // false ancak her ihtimal tek tek kontrol edilir yavaş çalışırondan
    }
}
