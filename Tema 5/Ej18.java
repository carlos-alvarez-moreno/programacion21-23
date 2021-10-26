import java.util.Scanner;
public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1=0;
		int num2=0;
		do {
			System.out.println("Introduce dos numeros diferentes:");
			num1 = s.nextInt();
			num2 = s.nextInt();
		}while(num1==num2);
		
		if(num1>num2) {
			int aux = num2;
			num2=num1;
			num1=aux;
		}
		for(int i=num1 ; i<num2; i=i+7) {
			System.out.println(i);
		}
	}

}
