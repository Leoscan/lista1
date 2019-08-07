import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float m2 = 0;
		System.out.print("Informe o tamanho (m2): ");
		m2 = entrada.nextFloat();
		
		float qLitros = m2/3;
		int xLatas = (int) (qLitros / 18);
		
		if (xLatas == 0) {
			xLatas = 1;
		}
		
		float sobra = (18*xLatas) - qLitros;
		float preco = xLatas*80;
		
		if (xLatas == 1) {
			System.out.println("1 lata é o suficinte para "+m2+" metros^2");
			System.out.println("sobra de: "+sobra+" Litros");
			System.out.println("total a pagar: "+preco);
		} else {			
			System.out.println(xLatas+" são o suficiente para "+m2+" metros^2");
			System.out.println("sobra de: "+sobra+" Litros");
			System.out.println("total a pagar: "+preco);
		}
		
		entrada.close();

	}

}
