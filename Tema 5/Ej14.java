import java.util.Scanner;
public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce una base: ");
		int base=s.nextInt();
		System.out.print("Introduce un exponente: ");
		int exponente = s.nextInt();
		int total=1;
		
		for(int i=0; i<exponente ;i++) {
			total = total*base;
			
		}
		System.out.print("el resultado es:"+total);
	}

}
