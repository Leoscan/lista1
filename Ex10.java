import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("Informe um número (int): ");
		num1 = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Informe um número (int): ");
		num2 = entrada.nextInt();
		
		float num3 = 0;
		System.out.print("Informe um número (real): ");
		num3 = entrada.nextFloat();
		
		int produto = (num1*2)*(num2/2);
		double soma = (num1*3)+num3;
		double cubo = Math.pow(num3, 3);
		System.out.println("o produto do dobro do primeiro com metade do segundo= "+produto);
		System.out.println("a soma do triplo do primeiro com o terceiro= "+soma);
		System.out.println("o terceiro elevado ao cubo.= "+cubo);
		
		entrada.close();
	}

}
