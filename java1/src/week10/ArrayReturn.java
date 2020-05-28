package week10;

public class ArrayReturn {
	/**
	 * 크기가10인 배열을 만들어서, 
	 * 각 배열에
	 * 1*1
	 * 2*2
	 * 3*3
	 * .
	 * .
	 * .
	 * 9*9
	 * 값을 저장하여
	 * 출력하는  프로그램이다.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		array = makeArray();
		printArray(array,10);
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
	 * 배열을 받아들인 후 받아들인후 주어진 수 만큼 배열을 출력한다.
	 * @param a	출력할 배열
	 * @param n	출력할 배열의 원소의 개수
	 */
	public static void printArray(int[] a, int n) {
		for(n=0;n<=a.length-1;n++) {
			System.out.print(a[n]);
			System.out.print(" ");
		}
	}
}
