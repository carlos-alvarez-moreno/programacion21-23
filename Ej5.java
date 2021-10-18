import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		double pesetas=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce la cantidad de pesetas que quiere convertir a euros: ");
		pesetas = sc.nextInt();
		double euros = pesetas/166.386;
		System.out.print("La cantidad en pesetas seria: "+euros);
	}

}