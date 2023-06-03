package day34_Inheritance;

public class Personel {


    int persNo;
    String isim = "Isim belirtilmedi";
    String departman = "Departman belirtilmedi";

    public void maas(){
        System.out.println("Tum personelin maasi vardir.");
    }

    public void mesai(){
        System.out.println("Tum personel statüsüne göre mesai yapar.");
    }

    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir.");

    }



}
