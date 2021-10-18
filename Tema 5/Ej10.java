import java.util.Scanner;
public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int contador=-1;
		int suma=0;
		int media=0;
		System.out.print("Introduce numeros para calcular la media para salir introduce uno negativo:");
		while(num>=0){
			suma = suma+num;
			contador++;
			num = sc.nextInt();
		}
		if(suma>0) {
			media = suma/contador;
		}
		System.out.print("la media de los numeros introducidos es: "+media);
	}

}
