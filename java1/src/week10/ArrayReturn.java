package week10;

public class ArrayReturn {
	/**
	 * ũ�Ⱑ10�� �迭�� ����, 
	 * �� �迭��
	 * 1*1
	 * 2*2
	 * 3*3
	 * .
	 * .
	 * .
	 * 9*9
	 * ���� �����Ͽ�
	 * ����ϴ�  ���α׷��̴�.
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
	 * �迭�� �޾Ƶ��� �� �޾Ƶ����� �־��� �� ��ŭ �迭�� ����Ѵ�.
	 * @param a	����� �迭
	 * @param n	����� �迭�� ������ ����
	 */
	public static void printArray(int[] a, int n) {
		for(n=0;n<=a.length-1;n++) {
			System.out.print(a[n]);
			System.out.print(" ");
		}
	}
}
