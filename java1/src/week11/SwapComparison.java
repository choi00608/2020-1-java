package week11;

public class SwapComparison {
	/**
	 * swap �� �ΰ��� ����� �׽�Ʈ�Ѵ�
	 * @param args
	 */
	public static void main(String[] args) {

		int[] anArray = {10,20};
		/**
		 * 1. anArray[0],anArray[1]�� ���� ���� x,y�� ������.
		 * 2. swap ���� ���� �� x,y ����, temp ������ ����� x���� �ӽ÷� �����Ѵ�.
		 * 3. x�� y���� �ְ�,
		 * 4. y�� temp���� �ִ´�.
		 */
		swap(anArray[0], anArray[1]);
		System.out.println("anArray[0]="+anArray[0]+", anArray[1]="+anArray[1]);
		/**
		 * 1. anArray�� ����Ʈ���� �ٲٰ� ���� ���� �������� ������
		 * 2. �ٲٰ� ���� �������� ���� i �� j �� �����Ѵ�
		 * 3. ���� temp�� �����, anArray[i]���� �����Ѵ�.
		 * 4. anArray[j] ���� anArray[i]�� �����Ѵ�.
		 * 
		 */
		swap(anArray, 0, 1);
		System.out.println("anArray[0]="+anArray[0]+", anArray[1]="+anArray[1]);

	}
	/**
	 * x,y�� ���� ���� �ٲ��ش�.
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	/**
	 * �迭�� �� ���� ���� ���� �ٲ��ش�.
	 * a[i]<--->a[j]
	 * @param a �迭
	 * @param i ���� �ٲ� �� ��ȣ
	 * @param j ���� �ٲ� �� ��ȣ
	 */
	public static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
