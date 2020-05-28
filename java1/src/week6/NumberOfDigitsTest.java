package week6;
/**
 * 주어진 수가 몇자리 수 인지 알아내는 프로그램
 * int 를 사용했기 때문에 10자리가 최대임
 */
import java.util.Scanner;

public class NumberOfDigitsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수의 자리 수를 알려줍니다.");
		System.out.println("정수를 입력하시오.");
		System.out.println("int 타입 수이어야 하고 0이 아니어야 합니다.");

		int n =input.nextInt();

		System.out.println(numberOfDigits(n)+"자리 수 입니다");
		input.close();
	}
	/**
	 * 10의 거듭제곱 수를 만들어 준다.
	 * 10의 0거듭제곱은 1이다.
	 * @param n 몇 거듭제곱을 할 것인지 지정한다. n은 0 이상 정수이여야 한다.
	 * @return 10의 n거듭제곱수.
	 */
	public static int powerOfTen(int n) {
		int i;
		int temp = 1;
		for(i=1;i<n;i++) {
			temp*=10;
		}
		return temp;
	}
	/**
	 * 주어진 정수가 몇자리 수인지 알아낸다.
	 * @param n 주어진 정수 , 0이 아니어야 한다.
	 * @return 0이 몇자리 수인지.
	 */
	public static int numberOfDigits(int n) {
		int i;
		int share = 0;
		for(i=10;share==0;i--) {
			share = (n/powerOfTen(i-1));
			if(i==10&&share!=0) {
				return (10);
			}
		}
		return (i);
	}
}
