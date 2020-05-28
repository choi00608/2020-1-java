package week10;

public class RandomNumbers {
	/**
	 * 0�̻� 10�̸��� ���������� ũ�Ⱑ 10�� �迭�� ä�� ��
	 * �� �迭���� ����Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[20];

		array1 = makeRandomArray(array1.length,10);

		System.out.println("0 �̻� 10 �̸� ���� ����");
		printArray(array1);
	}
	/**
	 * �迭�� ũ��� ������ ������ �޾� 
	 * 0�̻� max �̸��� ������ �迭�� ä���
	 * �׹迭�� ��ȯ�Ѵ�.
	 * @param n �迭�� ũ��
	 * @param max ������ ����
	 * @return ���� �迭
	 */
	public static int[] makeRandomArray(int n , int max){
		int [] a1 = new int[n];
		for(int i = 0;i<=n-1;i++) {
			a1[i] = (int)(max*(Math.random()));
		}
		return a1;
	}
	/**
	 * �迭�� ���� �� 
	 * �迭�� ���ҵ��� ���ʷ� ����Ѵ�.
	 * @param b1 ����� �迭
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
