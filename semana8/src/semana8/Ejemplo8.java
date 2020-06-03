package semana8;
import java.util.*;
public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int num1,num2,i,j;
		System.out.println("Ingrese el numero");
		num1=scan.nextInt();
		System.out.println("Ingrese el numero");
		num2=scan.nextInt();
		for (i=num1 ;i<=num2;i++) {
			for (j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
     System.out.println();
	}

}
