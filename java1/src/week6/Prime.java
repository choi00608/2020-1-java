package week6;
/**
 * 2부터 20까지의 수 중 소수를 찾는 프로그램
 * 2가지 방법으로 보여준다.
 * @author choi0
 *
 */
public class Prime {

	public static void main(String[] args) {

		for (long i = 2;i<=20;i++) {
			System.out.println("첫 번째 방법"+i+"은(는) 소수이다: "+isPrime1(i));
			System.out.println("두 번째 방법"+i+"은(는) 소수이다: "+isPrime2(i));
			System.out.println();
		}

	}
	/**
	 * 숫자를 하나하나 더하면서 자신을 제외한 자신보다 작을 수 중 
	 * 자신과 나눠질 수 있는 수가 있으면 그 수 는 소수가 아님
	 * @param n 2부터 20까지의 수 
	 * @return 주어진 수가 소수인지 아닌지
	 */
	public static boolean isPrime1(long n) {
		boolean isPrime = true;
		for (long i = 2; i<n; i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	/**
	 * 2부터 자신을 넘지 않는 제곱수들 중에 
	 * 자신과 나눠질 수 있으면 숫가 아님
	 * ex)37은 2부터 6(6^2=36)까지
	 * ex)19는 2부터 4(4^2=16)까지
	 * @param n 2부터 20까지의 수 
	 * @return n이 소수인지 아닌지
	 */
	public static boolean isPrime2(long n) {
		boolean isPrime = true;
		for (long i = 2; i*i<=n; i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
