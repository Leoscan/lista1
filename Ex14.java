import java.util.Scanner;

public class Ex14 {

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
	
		
		float sBruto = ((hSaida-hEntrada)*30)*reais;
			System.out.println("Seu sálario em um mês de 30 dias é de: "+sBruto+" reais");
		
		
		float iRenda = (sBruto/100)*11;
		float inss = (sBruto/100)*8;
		float sind = (sBruto/100)*5;
			System.out.println("Descontando para Imposto de Renda um total de: "+iRenda+" reais");
			System.out.println("Descontando para INSS um total de: "+inss+" reais");
			System.out.println("Descontando para Sindicato um total de: "+sind+" reais");
		
		float sLiquid = ((sBruto - iRenda)-inss)-sind;
		
			System.out.println("Sálario liquido de: "+sLiquid+" reais");
		
		
		entrada.close();
	}

}
