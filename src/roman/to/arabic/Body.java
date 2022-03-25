package roman.to.arabic;

import java.util.Scanner;

public class Body {
    static int input;
    public Body(int input){
    Body.input =input;
    }
    //Welcome Message and Input taker
    public static void InputFromUser(){

        System.out.print("Welcome Enter any Arabic number:");
        Scanner scanner=new Scanner(System.in);
        input= scanner.nextInt();
    }
    //This Method will convert given number from 1 to 9
    public static void ConvertorTillNine(){
        int n1=input%10;
        switch(n1){
            case 1 ->System.out.print("I");
            case 2 -> System.out.print("II");
            case 3 -> System.out.print("III");
            case 4 -> System.out.print("IV");
            case 5 -> System.out.print("V");
            case 6 -> System.out.print("VI");
            case 7 -> System.out.print("VII");
            case 8 -> System.out.print("VIII");
            case 9 -> System.out.print("IX");
         }
    }
    //This Method will convert given number from 10 to 90
    public static void ConvertorTillHundred(){
        int n10=input/10%10;
        switch(n10){
            case 1 ->System.out.print("X");
            case 2 -> System.out.print("XX");
            case 3 -> System.out.print("XXX");
            case 4 -> System.out.print("XL");
            case 5 -> System.out.print("(L)X");
            case 6 -> System.out.print("LX");
            case 7 -> System.out.print("LXX");
            case 8 -> System.out.print("LXXX");
            case 9 -> System.out.print("XC");
        }
    }
    //This Method will convert given number from 100 to 900
    public static void ConvertorTillThousand(){
         int hundred=input/100%10;
        switch(hundred){
            case 1 ->System.out.print("C");
            case 2 -> System.out.print("CC");
            case 3 -> System.out.print("CCC");
            case 4 -> System.out.print("CD");
            case 5 -> System.out.print("D");
            case 6 -> System.out.print("DC");
            case 7 -> System.out.print("DCC");
            case 8 -> System.out.print("DCCC");
            case 9 -> System.out.print("CM");
        }
    }
    //This Method will convert given number from 1000 to 9000
    public static void ConvertorTillTenThousands(){
        int thousand=input/1000%20;
        switch(thousand){
            case 1 ->System.out.print("M");
            case 2 -> System.out.print("MM");
            case 3 -> System.out.print("MMM");
            case 4 -> System.out.print("MMMM");
            case 5 -> System.out.print("(V)");
            case 6 -> System.out.print("(VI)");
            case 7 -> System.out.print("(VII)");
            case 8 -> System.out.print("(VIII)");
            case 9 -> System.out.print("(ix)");
        }
    }
    //This Method will convert given number from 10000 to 90000
    public static void ConvertorTillHundredThousands(){
        int tenThousand=input/10000%10;
        switch(tenThousand){
            case 1 ->System.out.print("(X)");
            case 2 -> System.out.print("(XX)");
            case 3 -> System.out.print("(XXX)");
            case 4 -> System.out.print("(XXXX)");
            case 5 -> System.out.print("L");
            case 6 -> System.out.print("LX");
            case 7 -> System.out.print("LXX");
            case 8 -> System.out.print("LXXX");
            case 9 -> System.out.print("XC");
        }
    }
    //This Method will convert given number from 100000 to 900000
    public static void ConvertorTillMillion(){
        int hThousand=input/100000%10;
        switch(hThousand){
            case 1 ->System.out.print("(C)");
            case 2 -> System.out.print("(CC)");
            case 3 -> System.out.print("(CCC)");
            case 4 -> System.out.print("(CCCC)");
            case 5 -> System.out.print("(D)");
            case 6 -> System.out.print("(DC)");
            case 7 -> System.out.print("(DCC)");
            case 8 -> System.out.print("(DCCC)");
            case 9 -> System.out.print("CM");
        }
    }
    //This Method will convert given number MILLIONS
    public static void ConvertorMillions(){
        int millions=input/1000000;
        switch(millions){
            case 1 ->System.out.print("(M)");
            case 2 -> System.out.print("(MM)");
            case 3 -> System.out.print("(MMM)");
            case 4 -> System.out.print("(MMMM)");
            case 5 -> System.out.print("(V)");
            case 6 -> System.out.print("(VI)");
            case 7 -> System.out.print("(VII)");
            case 8 -> System.out.print("(VIII)");
            case 9 -> System.out.print("IX");
        }
    }


}
