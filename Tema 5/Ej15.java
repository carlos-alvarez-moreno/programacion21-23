import java.util.Scanner;
public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce la base:");
		int base = s.nextInt();
		System.out.print("Introduce el exponente:");
		int exponente = s.nextInt();
		int total=1;
		
		for(int i=0 ; i<exponente ; i++) {
			total = total * base;
			System.out.println(base+"^"+(i+1)+"="+total);
		}
	}

}
