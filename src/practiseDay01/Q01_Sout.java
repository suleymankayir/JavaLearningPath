package practiseDay01;



public class Q01_Sout {
    public static void main(String[] args) {

        String input = "123456";
        terseCevir(input);


    }

    private static void terseCevir(String input) {
       String tersInput = input.substring(input.length() - 1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput += input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}
