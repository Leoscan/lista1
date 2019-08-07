import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float altura = 0;
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		
		double pIdeal = (altura*72.7) - 58 ;
	 
		System.out.println("O Peso ideal para está altura é: "+pIdeal+" kg");
		
		entrada.close();
	}

}
