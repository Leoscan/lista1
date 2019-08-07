import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num1 = 0;
		System.out.print("Informe a primeira nota: ");
		num1 = entrada.nextFloat();
		
		float num2 = 0;
		System.out.print("Informe a segunda nota: ");
		num2 = entrada.nextFloat();
		
		float num3 = 0;
		System.out.print("Informe a terceira nota: ");
		num3 = entrada.nextFloat();
		
		float num4 = 0;
		System.out.print("Informe a quarta nota: ");
		num4 = entrada.nextFloat();
	
		float media = (num1+num2+num3+num4)/4;
		System.out.println("A média das notas é: "+media);
		
		entrada.close();
	}

}
