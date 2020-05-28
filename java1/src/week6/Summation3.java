package week6;
/**

 * 임의의 두 정수 사이의 정수들의 합을 구하는 프로그램

 */
public class Summation3 {
	public static void main(String[] args) {

		int count = 1;

		int from, to;

		while (count <= 2) {

			from = count;

			to = count + 2;
			System.out.println("count=" + count + ", from=" + from + ", to=" + to);
			System.out.println("Summation from " + from + " to " + to + " = " + sum(from, to));

			count++;

		}

	}



	/**

	 * 주어진 구간의 자연수의 합을 구한다.

	 *

	 * @param from 구간의 시작 값.

	 * @param to   구간의 끝 값.

	 * @return 주어진 구간의 자연수의 합.

	 */

	public static int sum(int from, int to) {

		int sumResult = 0;

		int i;

		for (i = from; i <= to; i++) {
			System.out.println("from=" + from + ", to=" + to + ", i=" + i + ", sumResult=" + sumResult);
			sumResult += i;

		}

		return sumResult;

	}

}

