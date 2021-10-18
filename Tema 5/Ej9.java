import java.util.Scanner;
public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero:");
		int numero = sc.nextInt();
		int digitos = 1;
		while(numero>10){
			numero=numero/10;
			digitos++;
		}
		System.out.print("Tiene un total de: "+digitos+" digitos");
	}
}
