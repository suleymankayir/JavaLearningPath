package day33_Encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    /*
    getter methodu da tek bir islem yapıyor o da diger classların private olan tasitTurune ulasamadigi icin
    tasitTuru bilgisine class icinden alip methodCall yapilan class'lara return ediyor.
     */

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    /*
    return olmadigi icin bu methodun cagrildigi tasitRunner class'inda calistirilamaz
    burada tek bir satirlik islem var o tek satirlik islem ise class'da verilen degeri kendi classindaki
    instance variable'a atamak
     */

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variable'lar icin olusturulan getter method isimleri isVariableIsmi seklinde olur.
    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
