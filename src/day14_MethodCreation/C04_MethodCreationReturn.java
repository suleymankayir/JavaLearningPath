package day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        String isim = "Karim";
        String soyisim = "Karim";

        String str = gizliYazdir(isim,soyisim);
        System.out.println(str);

    }

    private static String gizliYazdir(String isim, String soyisim) {
        isim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        return isim + " " + soyisim;
    }
}
