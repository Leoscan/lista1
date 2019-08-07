import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float peso = 0;
		System.out.print("Informe o peso (KG): ");
		peso = entrada.nextFloat();
		
		float excesso = 0;
		float multa = 0;
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso*4;
			System.out.println("Ouve um excedente de "+excesso+"KG");
			System.out.println("Multa: "+multa+" reais");
			
		} else {
			excesso = 50 - peso;
			System.out.println("Não ouve excesso de peso, ainda faltam: "+excesso+"KG para chegar no limite");
			System.out.println("Multa: "+multa+" reais");
		}
		
		
		entrada.close();
	}

}
