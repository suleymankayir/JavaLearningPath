package day32_StringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb);
        // append istedigimiz String'i sona ekler.

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);

        // araya ekleme yapmak istersek append yerine insert kullaniriz.

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);

    }







}
