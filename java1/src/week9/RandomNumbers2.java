package week9;


public class RandomNumbers2 {
	/**
	 * 10��¥�� �迭�� ���� 0�̻� 100�̸��� ������ �迭�� �߰��Ѵ�.
	 * for���� ����Ͽ� �迭�� ������������ �����ϰ�
	 * �迭�� �ּ�, �ִ밪�� ���� ����Ѵ�
	 * �迭�� ��հ��� ����Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = new int[10];
		int n = 0;
		double sum = 0;
		System.out.println("100���� ���� ��������:");
		for(int i =0;i<=9;i++) {
			a[i] = (int)(100*(Math.random()));
			System.out.println(a[i]);
			n++;
			sum = sum + a[i];
		}
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n ; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		System.out.println(" ");
		System.out.println("���ҵ� �� �ּҰ�:" + a[0]);
		System.out.println("���ҵ� �� �ִ밪:" + a[n-1]);
		System.out.println("���ҵ��� ��հ�:" + (sum/n));
	}

}


