import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();
	
		int soma = num1+num2;
		System.out.println("A soma dos dois números é: "+soma);
		
		entrada.close();
	}

}
