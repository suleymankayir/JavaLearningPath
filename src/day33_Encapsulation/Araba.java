package day33_Encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi";
    private String model = "Model belirtilmedi";

    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistiririlmemesi lazim.

    /*
    private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim.
    model'e deger atanabilsin ama gorulemesin(setter)
    yakit ise gorulebilsin ancak deger atanamasın(getter)
     */

    public void setModel(String model) {
        this.model = model;
    }


    public String getYakit() {
        return yakit;
    }
}
