package day12_stringManipulation;

public class C03_Replace {
    public static void main(String[] args) {
        String str = "Bu gun ha va cok guz el";

        System.out.println(str.replace(" ", "")); // aralardaki boslukları kaldırmak icin
        System.out.println(str.replace("h", "J").replace(" ", ""));
        System.out.println(str.replace("guz el", "harika"));

        str = str.replace("Bu gun","Bugun")
                .replace("ha va", "Java")
                .replace("guz el", "guzel");
        System.out.println(str);
    }
}
