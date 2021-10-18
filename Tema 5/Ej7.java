import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contraseña=3456;
		
		System.out.print("Bienvenido introduce la contraseña: ");
		int intento=sc.nextInt();
		
		for(int i=4; i>0; i--) {
			
			if(intento==contraseña) {
				System.out.print("La contraseña es correcta la caja fuerte se ha abierto");
				i=0;
			}
			else {
				System.out.println("la contraseña no es correcta "+i+" Intentos restantes");
				intento=sc.nextInt();
			}
			
		}
	}

}
