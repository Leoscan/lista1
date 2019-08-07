import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float raio = 0;
		System.out.print("Informe o raio do circulo em cm: ");
		raio = entrada.nextFloat();
		
		double area = Math.PI * (raio*raio);
		
		System.out.println("A área do circulo é: "+area+" cm");
		
		entrada.close();
	}

}
