package week10;

public class ArrayReturn2 {
	/**
	 * 아래와같은 값을 출력하는 프로그램이다.
	 * 0 1 4 9 16 25 36 49 64 81
	 * 0
	 * 0 1
	 * 0 1 4
	 * 0 1 4 9
	 * .
	 * .
	 * .
	 * 0 1 4 9 16 25 36 49 64 81
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array;
		int[] array2;

		array = makeArray();

		printArray(array,10);

		for(int j = 1;j<=10;j++) {
			array2 = makeArray(j);
			printArray(array2,j);
		}
	}
	/**
	 * 크기가 10인 int 배열을 구성한 후 
	 * n번방에 n*n의 값을 집어 넣는다 
	 * 배열을 반환한다.
	 * @return
	 */
	public static int[] makeArray() {
		int r[] = new int [10];
		for(int i = 0;i<=9;i++) {
			r[i] = i*i;
		}
		return r;
	}
	/**
	 * 배열과 배열의 크기를 입력받아서
	 * 받은 배열을 출력한다.
	 * @param a 출력할 배열
	 * @param n 배열의 크기
	 */
	public static void printArray(int[] a, int n) {
		for(n=0;n<=a.length-1;n++) {
			System.out.print(a[n]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	/**
	 * 배열의 크기 n을 입력받아서
	 * 크기가 n인 int 배열을 구성한 후 
	 * n번방에 n*n의 값을 집어 넣는다 
	 * 배열을 반환한다.
	 * @return
	 */
	public static int[] makeArray(int n) {
		int l[] = new int [n];
		for(int i = 0;i<=n-1;i++) {
			l[i] = i*i;
		}
		return l;
	}
}
