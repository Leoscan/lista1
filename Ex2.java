import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		System.out.println("O número informado foi: "+num);
		
		entrada.close();
	}

}
