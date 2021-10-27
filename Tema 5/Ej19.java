import java.util.Scanner;
public class Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide:");
		int altura = s.nextInt();
		for(int i=0; i<altura; i++) {
			
			for(int j=altura; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=-1; j<i*2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
