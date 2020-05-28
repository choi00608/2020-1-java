package week5;
/**
 * 구간이 될 정수 두 개를 입력하면 그 구간 안에 있는 짝수들의 합을 구하는 프로그램이다.
 * 큰 숫자를 먼저 입력해도 위치를 바꾸어 주기 때문에, 정상적인 계산이 가능하다
 * 0 0을 입력하면 프로그램이 종료된다.
 * @author choi0
 *
 */
import java.util.Scanner;

public class EvensSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정해진 구간의 짝수들의 합을  구합니다.");
		System.out.print("두 개의 정수를 입력하시오: ");
		int from=input.nextInt();
		int to=input.nextInt();
		if(from==0) {
			if(to==0) {
				System.out.println("감사합니다. 프로그램을 마칩니다");
				System.exit(-1);
			}
		}
		if(from>to) {
			int temp=from;
			from=to;
			to=temp;
		}

		int sum;
		sum= suma(from,to);
		System.out.println(from+"부터 "+to+"까지의 짝수의 합 = "+(sum-from));

		from=from+10;
		to=to+10;


		input.close();
	}
	/**
	 * 두간이 된 두 정수를 받아서 
	 * 짝수만 골라 더하는 수식이담겨있는 함수이다.
	 * @author choi0
	 *
	 */

	public static int suma(int sn, int ln) {
		int i;
		int tn=ln;
		for(i=sn;i<=tn;i++) {
			if(i%2==0) {
				sn=sn+i;
			}

		} 
		return sn;
	}
}