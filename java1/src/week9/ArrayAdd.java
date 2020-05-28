package week9;
/**
 * 10개 짜리 배열 2개를 만들어서 각각의 배열을 0이상 10미만 난수로 채운다
 * 10개짜리 배열을 하나 더 만들어서 이미 만들어 논 배열을 더한 값을 추가한다.
 * 각 배열을 출력한다.
 * @author choi0
 *
 */
public class ArrayAdd {

	public static void main(String[] args) {
		int [] a1 = new int[10];
		int [] a2 = new int[10];
		int [] a3 = new int[10];


		for(int i =0;i<=9;i++) {
			a1[i] = (int)(10*(Math.random()));
		}

		for(int i =0;i<=9;i++) {
			a2[i] = (int)(10*(Math.random()));
		}

		for(int i =0;i<=9;i++) {
			a3[i] = a1[i] + a2[i];
		}
		printArray(a1);
		printArray(a2);
		printArray(a3);

	}
	/**
	 * 배열 하나를 받아서 배열을 차례대로 출력한다.
	 * @param array
	 */
	public static void printArray(int[] array) {
		for(int i =0;i<=9;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}
}
