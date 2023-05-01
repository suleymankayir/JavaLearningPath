package day18_While_doWhile;

import java.util.Locale;

public class C01_WhileLoop {
    public static void main(String[] args) {
        char ilkHarf = 'f';
        char sonHarf = 't';
        String buyult = "";
        char temp = ilkHarf;
        while (temp <=sonHarf){
        buyult = (temp+"").toUpperCase(Locale.ENGLISH); // char olduğundan uppercase kullnmak adına
            // tırnak ekledik ki stringin gücünden faydalanalım.
            System.out.print(buyult+" ");
            temp+=1;
        }
    }
}
