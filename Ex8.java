import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float reais = 0;
		System.out.print("Quantos reais por hora: ");
		reais = entrada.nextFloat();
		
		float hEntrada = 0;
		System.out.print("Informe o horário de entrada no serviço: ");
		hEntrada = entrada.nextFloat();
		
		float hSaida = 0;
		System.out.print("Informe o horário de saida no serviço: ");
		hSaida = entrada.nextFloat();
	
		
		float total = ((hSaida-hEntrada)*30)*reais;
		System.out.println("Seu sálario em um mês de 30 dias é de: "+total+" reais");
		
		entrada.close();

	}

}
