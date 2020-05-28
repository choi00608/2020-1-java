package week5;
/**
 * 1부터 1까지 자연수의 합.
 * 1부터 2까지 자연수의 합.
 * 1부터 3까지 자연수의 합.
 * .
 * .
 * .
 * .
 * 1부터 20까지 자연수의 합.
 * 위와같이 출력하는 프로그램이다.
 * @author choi0
 *
 */
public class Summations {

	public static void main(String[] args) {

		int to=1;
		int sum;
		while(to<=20) {
			sum= suma(to);
			System.out.println("1부터 "+to+"까지의 자연수의 합 = "+sum);
			to++;
		}

	}
	public static int suma(int upto) {
		int i;
		int n=upto;
		for(i=1;i<n;i++) {
			upto=upto+i;

		} 
		return upto;
	}
}
