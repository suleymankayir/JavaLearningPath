package day41_AbstractClass_Interface;

public class C01_Exceptions {
    public static void main(String[] args) {
        try {
            calis();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calis() {
        throw new RuntimeException("Coook calis");
        /*
        throw ile kontrollü exception olustururken
        parametre olarak istedigimiz hata mesajini girebiliriz.
         */
    }


}
