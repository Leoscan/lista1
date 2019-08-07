import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		System.out.print("Metros: ");
		num = entrada.nextFloat();
		
		float cm = num * 100;
		System.out.println(num+" metros em centimetros é = "+cm+" centimetros");
		
		entrada.close();
	}

}
