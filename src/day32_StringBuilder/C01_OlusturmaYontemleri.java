package day32_StringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Animal");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        System.out.println(sb2.length()); // 6
        System.out.println(sb2.capacity()); // 22

        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 10

        sb3.append("aaaaaaaaaaaa");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb1.append("Java");
        System.out.println(sb1.length()); // 4
        System.out.println(sb1.capacity()); // 16

        sb1.append(" Candir");
        System.out.println(sb1.length()); // 11
        System.out.println(sb1.capacity()); // 16

        sb1.append(", bilen bilir");
        System.out.println(sb1.length()); // 24
        System.out.println(sb1.capacity()); // 34(16*2+2) eski kapasite çarpı 2 + 2 cunku kapasite asildi.
    }
}
