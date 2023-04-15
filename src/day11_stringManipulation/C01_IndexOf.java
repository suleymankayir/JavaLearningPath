package day11_stringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str  = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("g"));// 6
        System.out.println(str.indexOf('r')); // 7
        System.out.println(str.indexOf("j")); // -1
        System.out.println(str.indexOf("mek")); // 10

        // eger istediğimiz indexten sonra aramak istersek
        // aynı methodu iki parametreli olarak kullanabiliriz.

        System.out.println(str.indexOf("g",6+1)); // yazılan indexten itibaren baslar 6 yazarsa
        // ilk g yi bulur.

        // yukarıdaki cümlede 2. ve 3. e yi bulmak icin
        // 1.e nin indexine ihtiyacımız var
        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e",ilke+1);

        if (ikincie == -1) {
            System.out.println("İkinci bir e yok");
        } else {
            int ucuncue = str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("Ucuncu e yok");
            } else  {
                System.out.println("Ucuncu e'nin indexteki yeri : " + ucuncue);
            }
        }


    }

}
