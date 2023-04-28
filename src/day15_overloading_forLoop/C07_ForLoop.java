package day15_overloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        C06_StringTerseCevirme.terseCevir("ahmet");

        for (int i = 100; i > 0 ; i--) {
            if (i % 8 == 0){
                System.out.println(i);
            }

        }
    }
}
