import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero del que desea ver el cuadrado y el cubo de los 5 siguientes numeros: ");
		int num = sc.nextInt();
		for(int i=num; i<num+5; i++) {
			int cuadrado = i*i;
			int cubo = cuadrado*i;
			System.out.println(i+" "+cuadrado+" "+cubo);
		}
	}

}

