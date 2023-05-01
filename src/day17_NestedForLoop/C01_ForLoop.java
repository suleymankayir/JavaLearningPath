package day17_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        String input = "Emsal Efe";
        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {
        String tekrarsizInput = "";
        String islenecekKelime = input.replaceAll("\\W","");
        int harfSayisi = 0;
        tekrarsizInput += islenecekKelime.substring(0,1);
        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!tekrarsizInput.contains(islenecekKelime.substring(i,i+1))){
                tekrarsizInput += ", " + islenecekKelime.substring(i,i+1);
                harfSayisi += 1;

            }
        }
        System.out.println(tekrarsizInput);
        System.out.println("harfSayisi = " + (1+harfSayisi)) ;
    }
}
