package day32_StringBuilder;

public class C07_Delete {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(4,14);
        System.out.println(sb);

        int son = sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
