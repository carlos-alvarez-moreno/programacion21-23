import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero del que desea ver su tabla: ");
		int num = sc.nextInt();
		for(int i=0; i<=10; i++) {
			int tabla = num*i;
			System.out.println(num+"*"+i+"="+tabla);
		}
	}

}
