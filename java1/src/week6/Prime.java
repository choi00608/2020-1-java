package week6;
/**
 * 2���� 20������ �� �� �Ҽ��� ã�� ���α׷�
 * 2���� ������� �����ش�.
 * @author choi0
 *
 */
public class Prime {

	public static void main(String[] args) {

		for (long i = 2;i<=20;i++) {
			System.out.println("ù ��° ���"+i+"��(��) �Ҽ��̴�: "+isPrime1(i));
			System.out.println("�� ��° ���"+i+"��(��) �Ҽ��̴�: "+isPrime2(i));
			System.out.println();
		}

	}
	/**
	 * ���ڸ� �ϳ��ϳ� ���ϸ鼭 �ڽ��� ������ �ڽź��� ���� �� �� 
	 * �ڽŰ� ������ �� �ִ� ���� ������ �� �� �� �Ҽ��� �ƴ�
	 * @param n 2���� 20������ �� 
	 * @return �־��� ���� �Ҽ����� �ƴ���
	 */
	public static boolean isPrime1(long n) {
		boolean isPrime = true;
		for (long i = 2; i<n; i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	/**
	 * 2���� �ڽ��� ���� �ʴ� �������� �߿� 
	 * �ڽŰ� ������ �� ������ ���� �ƴ�
	 * ex)37�� 2���� 6(6^2=36)����
	 * ex)19�� 2���� 4(4^2=16)����
	 * @param n 2���� 20������ �� 
	 * @return n�� �Ҽ����� �ƴ���
	 */
	public static boolean isPrime2(long n) {
		boolean isPrime = true;
		for (long i = 2; i*i<=n; i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
