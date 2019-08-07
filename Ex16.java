import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float m2 = 0;
		System.out.print("Informe o tamanho (m2): ");
		m2 = entrada.nextFloat();
		
		float qLitros = m2/6;
		int xLatas18 = (int) (qLitros / 18);
		
			if (xLatas18 == 0) {
				xLatas18 = 1;
			}
				
		float preco18 = xLatas18*80;
		
		int xLatas36 = (int) (qLitros / 3.6);
		
			if (xLatas36 == 0) {
				xLatas36 = 1;
			}
				
		float preco36 = (float) (xLatas36*25);

		
		if (xLatas18 == 1) {
			System.out.println("1 lata de 18l é o suficinte para "+m2+" metros^2");
			System.out.println("total a pagar (Latas 18l): "+preco18);
		} else {			
			System.out.println(xLatas18+" latas de 18l são o suficiente para "+m2+" metros^2");
			System.out.println("total a pagar (Latas 18l): "+preco18);
		}
		
		if (xLatas36 == 1) {
			System.out.println("1 lata de 3,6l é o suficinte para "+m2+" metros^2");
			System.out.println("total a pagar (Latas 3,6l): "+preco36);
		} else {			
			System.out.println(xLatas36+" latas de 3,6l são o suficiente para "+m2+" metros^2");
			System.out.println("total a pagar (Latas 3,6): "+preco36);
		}
		
		
		
		entrada.close();

	}

}
