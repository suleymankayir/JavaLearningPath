package day12_stringManipulation;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        String str = "1Bu2gu3n Ja*va- cok g3uz/el";
        str = str.replaceAll(" ", "space");
        System.out.println(str);
        str = str.replaceAll("\\W","");
        System.out.println(str);
        str = str.replaceAll("\\d", "");
        System.out.println(str);
        // butun gereksizlerden kurtuldugumuza göre boslukların karakter olarak gorulup
        // silinmesinin önüne gecmek icin verdigimiz space yerine boslukları tekrar koyabiliriz.
        str = str.replace("space", " ");
        System.out.println(str);
    }
}
