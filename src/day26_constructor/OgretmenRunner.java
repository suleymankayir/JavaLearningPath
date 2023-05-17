package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println(ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre","Kaya","17.10.94","Matematik","Fizik");
        System.out.println(ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","B","12.2.98");
        System.out.println(ogretmen3);
    }
}
