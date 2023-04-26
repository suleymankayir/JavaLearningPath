package day11_stringManipulation;

public class C03_Contains {
    public static void main(String[] args) {
        String email = "123@gmail.com";

        if (!email.contains("@gmail.com")) {
            System.out.println("Lütfen gmail adresinizi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi.");
        } else {
            System.out.println("Lütfen yazimi kontrol ediniz.");
        }
    }
}
