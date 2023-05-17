package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon();
        System.out.println(kamyon1.toString());
        System.out.println("");
        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println(kamyon2); // toString() methodu sayesinde toString() demeden de yazdırabiliyoruz.
        System.out.println("");
        Kamyon kamyon3 = new Kamyon("Mercedes", "3240", 2020, 40000);
        System.out.println(kamyon3);

        Kamyon kamyon4 = new Kamyon("Scania","S540");
        System.out.println(kamyon4);

    }
}
