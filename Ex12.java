import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float altura = 0;
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		
		boolean h = true;
		System.out.print("Você é um homem? (True/false): ");
		h = entrada.nextBoolean();
		
		float pIdeal = 0;
	
		if (h == true){
			System.out.println("É um homem usando a fórmula ((altura*72.7) - 58)");
			pIdeal = (float) ((altura*72.7) - 58) ;
		} else {
			System.out.println("É uma mulher usando a fórmula ((altura*62.1) - 44.7)");
			pIdeal = (float) ((altura*62.1) - 44.7) ;
		}
		
	 
		System.out.println("O Peso ideal para está altura é: "+pIdeal+" kg");
		
		entrada.close();


	}

}
