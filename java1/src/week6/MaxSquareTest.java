package week6;
/**
 * 키보드로부터 음의 정수를 입력 받는다.
 * 입력받은 수 보다 닥거나 같은 최대 정수제곱수를 찾아 출력한다.
 */
import java.util.Scanner;

public class MaxSquareTest {

	public static void main(String[] args) {
		System.out.println("어떤 수보다 작거나 같은 최대 \"정수의 제곱수\"를 찾을까요?");
		System.out.println("음이 아닌 정수를 입력하시오.");
		System.out.println("음수를 입력하면 프로그램이 종료됩니다.");

		Scanner input = new Scanner(System.in);
		int n = 0;

		while(n>=0) {
			System.out.print("입력: ");
			n = input.nextInt();
			if(n<0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(-1);
			}
			int maxSquare = maxSquare(n);
			System.out.println(n+"보다 작거나 같은 최대 \"정수의 제곱수\"는 "+maxSquare+"입니다.");
		}
		input.close();
	}
	/**
	 * 주어진 음이 아닌 정수보다
	 * 작거나 같은"정수의 제곱수"들 중 최대갑을 구한다.
	 * @param bound 주어진 정수. (음이 아닌 정수)
	 * @return 최대 "정수의 제곱수".
	 */
	public static int maxSquare(int bound){
		int i;
		int square = 0;
		for(i=1;square<bound;i++) {
			square = i*i;	
			if(square>bound)
				return (i-1)*(i-1);
		}
		return square;
	}
}
