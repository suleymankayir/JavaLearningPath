package day16_ForLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        int ilk = 1;
        int son = 100;
        for (int i = ilk; i <= son ; i++) {
            if (i%3 ==0 && i%5==0){
                System.out.println("Java Guzeldir");
            } else if (i%3==0){
                System.out.println("Java");
            } else if (i%5==0){
                System.out.println("Guzeldir");
            } else {
                System.out.println(i);
            }
        }
    }
}
