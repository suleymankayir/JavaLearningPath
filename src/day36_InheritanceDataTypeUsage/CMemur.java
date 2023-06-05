package day36_InheritanceDataTypeUsage;

public class CMemur extends BMuhasebe{

    int saatUcreti = 12;
    int gunlukMesai = 9;


    protected void maas(){
        System.out.println("Memurlar :" + (30*saatUcreti*gunlukMesai) + "maas alir");
    }


    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {
        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);
        System.out.println(mmr1.saatUcreti);
        mmr1.maas();
        mmr1.ozelSigorta(); // from BMuhasebe class
        mmr1.sigorta(); // from APersonel class
        System.out.println(mmr1.isim); // from APersonel class
        System.out.println(mmr1.soyisim); // from APersonel class
        System.out.println(mmr1.departman); // from APersonel class



        BMuhasebe mhsb1 = new BMuhasebe();

        System.out.println(mhsb1.gunlukMesai); // 8
        System.out.println(mhsb1.saatUcreti); // 10
        mhsb1.maas();
        mhsb1.ozelSigorta(); //
        mhsb1.sigorta(); // from APersonel class
        System.out.println(mhsb1.isim); // from APersonel class
        System.out.println(mhsb1.soyisim); // from APersonel class
        System.out.println(mhsb1.departman); // from APersonel class
    }



}
