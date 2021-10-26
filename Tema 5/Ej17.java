import java.util.Scanner;
public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero positivo:");
		int num = s.nextInt();
		if(num<0) {
			do {	
				System.out.print("Introduce un numero positivo:");
				num = s.nextInt();
			}while(num<0);
		}
		
		for(int i=num ; i<=num+100; i++) {
			System.out.println(i);
		}
	}

}
