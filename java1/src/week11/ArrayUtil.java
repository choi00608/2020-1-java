package week11;

public class ArrayUtil {
	/**
	 * �޼ҵ� �׽�Ʈ
	 * @param args
	 */
	public static void main(String[]args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		System.out.println("printArray �޼ҵ� �׽�Ʈ -----------");

		System.out.print("printArray(a,0): ");
		printArray(a,0);

		System.out.print("printArray(a,1): ");
		printArray(a,1);

		System.out.print("printArray(a,a.length): ");
		printArray(a,a.length);

		System.out.print("printArray(a,a.length+1): ");
		printArray(a,a.length+1);

		System.out.print("printArray(a,-1): ");
		printArray(a,-1);

		System.out.println();

		System.out.println("fillRandom �޼ҵ� �׽�Ʈ ----------");

		System.out.print("fillRandom(a,10): ");
		fillRandom(a,10);
		printArray(a,a.length);

		System.out.print("fillRandom(a,100): ");
		fillRandom(a,100);
		printArray(a,a.length);

		System.out.print("fillRandom(a,2): ");
		fillRandom(a,2);
		printArray(a,a.length);

		System.out.print("fillRandom(a,1): ");
		fillRandom(a,1);
		printArray(a,a.length);

		System.out.println();

		System.out.println("distict �޼ҵ� �׽�Ʈ----------------");

		int[] a2 = {1,1,2};

		System.out.println("a2 = {1,1,2}");

		System.out.println("distinct(a2,1): " 
				+ distinct(a2,1));

		System.out.println("distinct(a2,2): " 
				+ distinct(a2,2));

		System.out.println("distinct(a2,a2.length): " 
				+ distinct(a2,a2.length));

		System.out.println("distinct(a2,a2.length+1): " 
				+ distinct(a2,a2.length+1));

		System.out.println("distinct(a2,0): " 
				+ distinct(a2,0));

		System.out.println("distinct(a2,-1): " 
				+ distinct(a2,-1));

		System.out.println();

		int[] a3 = {1,2,3};

		System.out.println("a3 = {1,2,3}");

		System.out.println("distinct(a3,a3.length): " 
				+ distinct(a3,a3.length));

		System.out.println("distinct(a3,a3.length+1): " 
				+ distinct(a3,a3.length+1));

		System.out.println();

		int[] a4 = {1};

		System.out.println("a4 = {1}");

		System.out.println("distinct(a4,a4.length): " 
				+ distinct(a4,a4.length));

		System.out.println("distinct(a3,a3.length+1): " 
				+ distinct(a4,a4.length+1));

		System.out.println();

		int[] a5 = {};

		System.out.println("a5 = {}");

		System.out.println("distinct(a5,a5.length): " 
				+ distinct(a5,a5.length));

		System.out.println("distinct(a5,a5.length+1): " 
				+ distinct(a5,a5.length+1));

		System.out.println();

		System.out.println("fillRandomDistinct �޼ҵ� �׽�Ʈ------------");

		System.out.println("ũ�Ⱑ 10�� �迭 a");

		System.out.print("fillRandomDistinct(a,10): ");
		fillRandomDistinct(a, 10);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,100): ");
		fillRandomDistinct(a, 100);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,1): ");
		fillRandomDistinct(a, 1);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,0): ");
		fillRandomDistinct(a, 0);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,-1): ");
		fillRandomDistinct(a, -1);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		int[] a6 = new int[1];

		System.out.print("fillRandomDistinct(a6,1): ");
		fillRandomDistinct(a6, 1);
		printArray(a6, a6.length);
		System.out.println("distinct? :" + distinct(a6, a6.length));
		System.out.println();

		int[] a7 = new int[0];

		System.out.print("fillRandomDistinct(a7,0): ");
		fillRandomDistinct(a7, 0);
		printArray(a7, a7.length);
		System.out.println("distinct? :" + distinct(a7, a7.length));
		System.out.println();

		System.out.println("makeArray �޼ҵ� �׽�Ʈ --------------");

		System.out.print("make RandomArray(10,10): ");
		printArray(makeRandomArray(10,10),10);

		System.out.print("make RandomArray(10,1): ");
		printArray(makeRandomArray(10,1),10);

		System.out.print("make RandomArray(1,10): ");
		printArray(makeRandomArray(1,10),1);

		System.out.print("make RandomArray(1,0): ");
		printArray(makeRandomArray(1,0),1);

		System.out.print("make RandomArray(0,0): ");
		printArray(makeRandomArray(0,0),1);

		System.out.print("make RandomArray(-1,0): ");
		printArray(makeRandomArray(-1,0),1);

	}
	/**
	 * �迭��  �� �迭�� ����� ������ �޾� 
	 * ���ϴ� ��ŭ �迭�� ���� ����Ѵ�.
	 * @param a ����� �迭
	 * @param n ����� ������ ����
	 */
	public static void printArray(int[] a, int n) {

		if (n > a.length) {
			n = a.length;
		}

		if (n>0) {
			for (int i = 0; i < n;i++) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	/**
	 * �迭�� �޾Ƽ� �� �迭�� �־��� ����ŭ�� �Ѱ�� �ϴ� ������� ä�� �ִ´�.
	 * �ߺ�����
	 * @param list ������ ä�� �迭
	 * @param uBound ������ �ִ밪
	 */
	public static void fillRandom(int[] list, int uBound) {
		for (int i = 0;i<list.length;i++) {
			list[i] = (int)((uBound)*Math.random());
		}
	}
	/**
	 * �迭�� �޾Ƶ鿩��
	 * �� �迭�� �ߺ��Ǵ� ���� �ִ��� �Ǵ��Ѵ�.
	 * �ߺ��� ������ true, 
	 * �ߺ��� ������ false �� ��ȯ�Ѵ�.
	 * @param a �迭
	 * @param n �迭�� ������ Ȯ���� ���ΰ�
	 * @return
	 */
	public static boolean distinct(int[] a, int n) {

		if (n > a.length) {
			n = a.length;
		}

		for (int j = 0;j < n;j++) {
			for (int i = 0;i < n;i++) {
				if ((a[j] == a[i])&&(j!=i)) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * �迭�� ������ �ִ밪�� �޾Ƽ� �迭���� ������ ä���.
	 * �ߺ��Ǵ¼��ڰ� ����� �ϱ� ������
	 * uBound >= list.length
	 * ��� ���������� �ٴ´�.
	 * @param list �迭
	 * @param uBound ������ �ִ밪
	 */
	public static void fillRandomDistinct(int[] list, int uBound) {

		boolean d = false;

		if (uBound >= list.length) {

			for (int i = 0;i<list.length;i++) {
				list[i] = (int)((uBound)*Math.random());
			}

			while(d == false) {

				for (int j = 0;j < list.length;j++) {
					for (int i = 0;i < list.length;i++) {
						if ((list[j] == list[i])&&(j!=i)) {
							list[j] = (int)((uBound)*Math.random());
						}
					}
				}

				if(distinct(list, list.length) == true) {
					d = true;
				}


			}

		}
		if (d==false) {
			System.out.print("uBound >= list.length �̾�� �մϴ�."
					+ " �迭�� ������ ������ �ʾҽ��ϴ�.");
			System.out.println();
		}
	}
	/**
	 * ���� �迭�� ũ�⸦ �޾� 
	 * ũ�Ⱑ n �� �迭�� ����� uBound���� �޾Ƶ鿩
	 * �������ִ밪���� �����ϰ� �迭�� ä���ִ´� 
	 * @param n �迭�� ũ��
	 * @param uBound ������ �ִ밪
	 * @return ������� �迭
	 */
	public static int[] makeRandomArray(int n, int uBound) {

		if(n<0) {

			System.out.println("�迭�� ũ��� ������ �� �����ϴ�.");
		}

		int[] a = new int[n];

		for (int i = 0;i<a.length;i++) {
			a[i] = (int)((uBound)*Math.random());
		}

		return a;
	}


}
