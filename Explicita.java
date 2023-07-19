//Conversão Explicita
public class Explicita {
	double numeroDecimal = 20.0;
	int numeroInteiro = (int) numeroDecimal;
	
	public static void main(String[] args) {
        Explicita ex2 = new Explicita();
        System.out.println(ex2.numeroDecimal);
        System.out.println(ex2.numeroInteiro);
    }
}
