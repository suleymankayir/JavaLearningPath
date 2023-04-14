package day09_TernaryOperator;

public class C06_SwitchCase {
    public static void main(String[] args) {
        String input = "Cumartesi";
        input = input.toLowerCase();

        switch (input){
            case "Pazartesi":
            case "Salı":
            case "Carsamba":
            case "Persembe":
            case "Cuma":
                System.out.println("Hafta ici");
                break;
            case "Cumartesi":
            case "Pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

    }
}
