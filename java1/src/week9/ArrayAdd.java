package week9;
/**
 * 10�� ¥�� �迭 2���� ���� ������ �迭�� 0�̻� 10�̸� ������ ä���
 * 10��¥�� �迭�� �ϳ� �� ���� �̹� ����� �� �迭�� ���� ���� �߰��Ѵ�.
 * �� �迭�� ����Ѵ�.
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
	 * �迭 �ϳ��� �޾Ƽ� �迭�� ���ʴ�� ����Ѵ�.
	 * @param array
	 */
	public static void printArray(int[] array) {
		for(int i =0;i<=9;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}
}
