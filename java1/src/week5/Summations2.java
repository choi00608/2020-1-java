package week5;
/**
 * 10부터 20까지 자연수의 합.
 * 20부터 30까지 자연수의 합.
 * 30부터 40까지 자연수의 합.
 * .
 * .
 * .
 * .
 * 90부터 100까지 자연수의 합.
 * 위와같이 출력하는 프로그램이다.
 * @author choi0
 *
 */
public class Summations2 {

	public static void main(String[] args) {
		int from=10;
		int to=20;

		int sum;
		while(to<=100) {
			sum= suma(from,to);
			System.out.println(from+"부터 "+to+"까지의 자연수의 합 = "+(sum-from));

			from=from+10;
			to=to+10;



		}

	}
	/**
	 * 10씩 늘어나는 구간을 받아서 구간안의 값들의 합을 구하는 함수이다.
	 * @author choi0
	 *
	 */
	public static int suma(int sn, int ln) {
		int i;
		int tn=ln;
		for(i=sn;i<=tn;i++) {
			sn=sn+i;

		} 
		return sn;
	}
}
