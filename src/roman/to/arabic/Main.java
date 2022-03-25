package roman.to.arabic;

public class Main {
    public static void main(String[] args) {
        while (Body.input==0) {
            Body.InputFromUser();
            Body.ConvertorMillions();
            Body.ConvertorTillMillion();
            Body.ConvertorTillHundredThousands();
            Body.ConvertorTillTenThousands();
            Body.ConvertorTillThousand();
            Body.ConvertorTillHundred();
            Body.ConvertorTillNine();
        }

    }
}
