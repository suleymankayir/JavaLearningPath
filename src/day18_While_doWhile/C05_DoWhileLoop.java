package day18_While_doWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        int bas = 9;
        int bitis = 190;

        int temp = bas;
        /*
        while (temp < bitis) {
            if (temp % 7 == 0){
                System.out.print(temp + " ");

            }
            temp++;
        }
        */
        do{
            if (temp % 7 == 0){
                System.out.print(temp+ " ");
            }
            temp++;
        } while (temp < bitis);

    }
}