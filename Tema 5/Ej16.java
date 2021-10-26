import java.util.Scanner;
public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero y te dire si es primo o no:");
		int num = s.nextInt();
		boolean primo=false;
		
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
			primo = true;
			}
		}
		if(primo) {
			System.out.print("es primo");
		}
		else {
			System.out.print("no es primo");
		}
	}

}
