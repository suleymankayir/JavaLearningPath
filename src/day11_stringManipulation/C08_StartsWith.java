package day11_stringManipulation;

public class C08_StartsWith {
    public static void main(String[] args) {
        String input = "Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5)); // 5.index ve sonrası gun ile basladıgı icin true
    }
}
