package day11_stringManipulation;

public class C06_EndsWith {
    public static void main(String[] args) {
        String email = "asd@gmail.coma";

        if (!email.contains("gmail.com")) {
            System.out.println("Lutfen gmail adresinizi giriniz");
        }  else {
            if (email.endsWith("gmail.com")){
                System.out.println("Emailiniz kaydedildi");
            } else {
                System.out.println("Lutfen yazimi kontrol ediniz.");
            }

        }
    }
}
