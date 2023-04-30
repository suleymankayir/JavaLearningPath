package day16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        int input = 72;
        tamBoleniVer(input);
    }

    private static void tamBoleniVer(int input) {
        for (int i = input; i >=1 ; i--) {
            if (input%i==0){
                System.out.println(i);
            }
        }

    }
}
