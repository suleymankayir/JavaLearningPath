package day29_PassByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        String str = "Yildiz Bank";

        str.toLowerCase();
        System.out.println(str);
        str.substring(3,5);
        // str üzerinde ne kadar degisiklik yaparsak yapalım String DataType'i immutable oldugu icin degismez.

        // Java'da String gibi metin ifadelerde kullanabilecegimiz mutable StringBuilder class'i da vardir.

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); // StringBuilder oldugu icin mutable olmasından ötürü tersini yazdirir.

        sb.append(".");
        System.out.println(sb); // atama olmasına bakılmaksızın String deger builder ise degisir.

    }
}
