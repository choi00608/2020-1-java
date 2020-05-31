package week11;

public class Search {
	/**
	 * a�޼ҵ� �׽�Ʈ
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,2,3,2,5};

		System.out.println("linearSearch �׽�Ʈ ----------");

		System.out.print("�迭 a: ");
		ArrayUtil.printArray(a, a.length);

		System.out.println("linear Search(a,a.length,5): "
				+ linearSearch(a,a.length,5));

		System.out.println("linear Search(a,1,1): "
				+ linearSearch(a,1,1));

		System.out.println("linear Search(a,4,5): "
				+ linearSearch(a,4,5));

		System.out.println("linear Search(a,1,2): "
				+ linearSearch(a,1,2));

		System.out.println("linear Search(a,a.length,2): "
				+ linearSearch(a,a.length,2));

		System.out.println("linear Search(a,0,5): "
				+ linearSearch(a,0,5));

		System.out.println("linear Search(a,a.length,4): "
				+ linearSearch(a,a.length,4));

		System.out.println();

		System.out.println("bianarySearch �׽�Ʈ---------------");
		System.out.print("InsertionSort.sort(a, a.length): ");
		InsertionSort.sort(a, a.length);
		ArrayUtil.printArray(a, a.length);
		System.out.println();

		System.out.println("bianarySearch(a,a.length,5): "
				+ bianarySearch(a,a.length,5));
		System.out.println();

		System.out.println("bianarySearch(a,1,1): "
				+ bianarySearch(a,1,1));
		System.out.println();

		System.out.println("bianarySearch(a,4,5): "
				+ bianarySearch(a,4,5));
		System.out.println();

		System.out.println("bianarySearch(a,1,2): "
				+ bianarySearch(a,1,2));
		System.out.println();

		System.out.println("bianarySearch(a,a.length,2): "
				+ bianarySearch(a,a.length,2));
		System.out.println();

		System.out.println("bianarySearch(a,0,5): "
				+ bianarySearch(a,0,5));
		System.out.println();

		System.out.println("bianarySearch(a,a.length,4): "
				+ bianarySearch(a,a.length,4));
		System.out.println();

	}
	/**
	 * ����Ž�� �Լ�
	 * �迭 x �� �� n���� �濡 key�� ��� �ִ°�?
	 * @param x �迭
	 * @param n x�� �� ��� �濡��  key �� �O�� ���ΰ�?
	 * @param key ã�� ������
	 * @return	key�� ������ ���� ���� �ε������� ��ȯ, ������ -1 ��ȯ
	 */
	public static int linearSearch(int[] x, int n, int key) {
		for (int i = 0;i < n;i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * ����Ž��
	 * ��������: �迭 x �� �̹� ������������ ���ĵǾ��־�� ��
	 * �迭���� �����Ͱ� �� �� ���� ���� �� �ִ�.
	 * @param x ���ĵ� ���� �迭
	 * @param n x�� ����ִ� �������� ����
	 * @param key ã�� ������
	 * @return
	 */
	public static int bianarySearch(int[] x , int n, int key) {

		int lo = 0; 
		int  hi = n-1;
		int  mid;

		while (hi >= lo) {
			mid  = (hi + lo) / 2;
			if (key == x[mid])
				return mid;
			if (key < x[mid])
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return -1;
	}

}
