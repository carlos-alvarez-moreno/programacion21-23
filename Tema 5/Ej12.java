import java.util.Scanner;
public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fibonacci=1;
		int suma=0;
		System.out.print("introduce cuantos numeros de fibonacci desea ver:");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int aux=suma;
			suma = fibonacci;
			fibonacci = aux +fibonacci;
			System.out.println(fibonacci);
		}

	}

}
