import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int contadorneg=0;
		int contadorpos=0;
		System.out.print("introduce 10 numeros:");
		for(int i=0; i<10; i++) {
			int num = s.nextInt();
			if(num<0) {
				contadorneg++;
			}
			else {
				contadorpos++;
			}
		}
		System.out.println("has introducido:"+contadorpos+" positivos");
		System.out.println("has introducido:"+contadorneg+" negativos");
	}

}
