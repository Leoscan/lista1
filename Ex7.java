import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float lado = 0;
		System.out.print("Informe a medida do lado do quadrado: ");
		lado = entrada.nextFloat();
		
		float area = lado*lado;
		System.out.println("Um quadrado de lado "+lado+" tem uma área de "+area);
		
		entrada.close();
	}

}
