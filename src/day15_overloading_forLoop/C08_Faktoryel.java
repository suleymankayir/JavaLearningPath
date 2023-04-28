package day15_overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {
        int input = 5;
        faktoriyelHesapla(input);

    }

    public static void faktoriyelHesapla(int input) {
        int faktoryel = 1;
        if (input<0 || input>20) {
            System.out.println("Faktoriyel hesaplanamaz");
        } else if (input==0){
            System.out.println("0! = 1'dir");
        } else {
            for (int i = 1; i<=input ; i++) {
                faktoryel *= i;
            }
            System.out.println(faktoryel);
        }

    }
}
