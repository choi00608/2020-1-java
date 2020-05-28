package week10;

public class ArrayReturn2 {
	/**
	 * �Ʒ��Ͱ��� ���� ����ϴ� ���α׷��̴�.
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
	 * ũ�Ⱑ 10�� int �迭�� ������ �� 
	 * n���濡 n*n�� ���� ���� �ִ´� 
	 * �迭�� ��ȯ�Ѵ�.
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
	 * �迭�� �迭�� ũ�⸦ �Է¹޾Ƽ�
	 * ���� �迭�� ����Ѵ�.
	 * @param a ����� �迭
	 * @param n �迭�� ũ��
	 */
	public static void printArray(int[] a, int n) {
		for(n=0;n<=a.length-1;n++) {
			System.out.print(a[n]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	/**
	 * �迭�� ũ�� n�� �Է¹޾Ƽ�
	 * ũ�Ⱑ n�� int �迭�� ������ �� 
	 * n���濡 n*n�� ���� ���� �ִ´� 
	 * �迭�� ��ȯ�Ѵ�.
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
