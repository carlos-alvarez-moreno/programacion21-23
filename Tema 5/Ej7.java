import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contrase�a=3456;
		
		System.out.print("Bienvenido introduce la contrase�a: ");
		int intento=sc.nextInt();
		
		for(int i=4; i>0; i--) {
			
			if(intento==contrase�a) {
				System.out.print("La contrase�a es correcta la caja fuerte se ha abierto");
				i=0;
			}
			else {
				System.out.println("la contrase�a no es correcta "+i+" Intentos restantes");
				intento=sc.nextInt();
			}
			
		}
	}

}
