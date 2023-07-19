//Conversão de String para Double


public class ConverteString2 {
    String numeroString = "100";
    double numeroDecimal = Double.parseDouble(numeroString);

    public static void main(String[] args) {
        ConverteString2 ex3 = new ConverteString2();
        System.out.println(ex3.numeroString);
        System.out.println(ex3.numeroDecimal);
    }
}
