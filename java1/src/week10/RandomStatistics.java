package week10;

public class RandomStatistics {
	/**
	 * ũ�Ⱑ10�� �迭�� ����
	 * 100���� ���� ������ �迭�� ä���.
	 * �迭�� ���ҵ� �� �ִ�, �ּ�, ��հ��� ���� ����Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int [10];

		writeRandomNumbers(array, 100);

	}
	/**
	 * 0�̻� n �̸��� ���� ������ �߻����� �迭 a�� ���ʷ� ä���.
	 * @param a ������ ������ �迭
	 * @param n 0�̻� n �̸����� �߻�
	 */
	public static void writeRandomNumbers(int[] a, int n) {
		System.out.println("100���� ���� ����");
		for(int i =0;i<=a.length-1;i++) {
			a[i] = (int)(n*(Math.random()));
			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println("���ҵ� �� �ּҰ�: " + min(a));
		System.out.println("���ҵ� �� �ִ밪: " + max(a));
		System.out.println("���ҵ��� ��հ�: " + average(a));
	}
	/**
	 * �迭 a�� ���� �� �ּҰ��� ���� ��ȯ�Ѵ�
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ּҰ�
	 */
	public static int min(int[] a) {
		for(int i=0 ; i<a.length; i++) {
			for(int j=i+1 ; j<a.length; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		return(a[0]);
	}
	/**
	 * �迭 a�� ���� �� �ִ밪�� ���� ��ȯ�Ѵ�
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ִ밪
	 */
	public static int max(int[] a) {
		for(int i=0 ; i<a.length; i++) {
			for(int j=i+1 ; j<a.length; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		return(a[a.length-1]);
	}
	/**
	 * �迭a�� ���ҵ��� ��հ��� ��ȯ�Ѵ�.
	 * @param a�迭�� ����Ű�� ��������
	 * @return ��հ�
	 */
	public static double average(int[] a) {
		int sum = 0;
		for(int i =0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		return(sum/a.length);
	}

}
