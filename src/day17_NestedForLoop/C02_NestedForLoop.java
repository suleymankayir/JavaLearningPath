package day17_NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
