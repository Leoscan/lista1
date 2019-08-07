import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float gFar = 0;
		System.out.print("Informe a temperatura em graus farenheit: ");
		gFar = entrada.nextFloat();
		
		double gCel = (gFar - 32)/1.8;

		System.out.println(gFar+" farenheit em celsius= "+gCel);
		
		entrada.close();

	}

}
