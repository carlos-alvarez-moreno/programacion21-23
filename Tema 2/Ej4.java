
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		double euros=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce la cantidad de euros que quiere convertir a pesetas: ");
		euros = sc.nextInt();
		double pesetas = euros*166.386;
		System.out.print("La cantidad en pesetas seria: "+pesetas);
	}

}