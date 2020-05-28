package week10;

public class RandomNumbers {
	/**
	 * 0이상 10미만의 정수난수로 크기가 10인 배열을 채운 후
	 * 그 배열들을 출력한다.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[20];

		array1 = makeRandomArray(array1.length,10);

		System.out.println("0 이상 10 미만 정수 난수");
		printArray(array1);
	}
	/**
	 * 배열의 크기와 난수의 범위를 받아 
	 * 0이상 max 미만의 난수로 배열을 채우고
	 * 그배열을 반환한다.
	 * @param n 배열의 크기
	 * @param max 난수의 범위
	 * @return 만든 배열
	 */
	public static int[] makeRandomArray(int n , int max){
		int [] a1 = new int[n];
		for(int i = 0;i<=n-1;i++) {
			a1[i] = (int)(max*(Math.random()));
		}
		return a1;
	}
	/**
	 * 배열을 받은 후 
	 * 배열의 원소들을 차례로 출력한다.
	 * @param b1 출력할 배열
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
