import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contraseņa=3456;
		
		System.out.print("Bienvenido introduce la contraseņa: ");
		int intento=sc.nextInt();
		
		for(int i=4; i>0; i--) {
			
			if(intento==contraseņa) {
				System.out.print("La contraseņa es correcta la caja fuerte se ha abierto");
				i=0;
			}
			else {
				System.out.println("la contraseņa no es correcta "+i+" Intentos restantes");
				intento=sc.nextInt();
			}
			
		}
	}

}
