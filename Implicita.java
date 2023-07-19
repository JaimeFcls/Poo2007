
//Conversão implícita
public class Implicita {
	int numeroInteiro = 10;
	double numeroDecimal = numeroInteiro;
	
	public static void main(String[] args) {
        Implicita ex1 = new Implicita();
        System.out.println(ex1.numeroInteiro);
        System.out.println(ex1.numeroDecimal);
    }
}
