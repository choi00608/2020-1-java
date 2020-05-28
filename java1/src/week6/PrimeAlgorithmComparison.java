package week6;
/**
 * �־��� ���� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���ÿ�
 * ������ ��� ����� �ɸ��� �ð��� ���ؼ� �󸶳� �ɷȴ��� ����Ѵ�.
 * �׸��� ���Ѵ�.
 * @author choi0
 *
 */
public class PrimeAlgorithmComparison {

	public static void main(String[] args) {

		long n = 3033333343L;
		long startTime;
		long endTime;

		startTime = System.currentTimeMillis();
		System.out.println("ù ��° ���"+n+"��(��) �Ҽ��̴�: "+isPrime1(n));
		endTime = System.currentTimeMillis();
		System.out.println("ù ��° ��� ���ð�: "+(endTime-startTime)+"ms");
		startTime = 0;
		endTime = 0;

		startTime = System.currentTimeMillis();
		System.out.println("�� ��° ���"+n+"��(��) �Ҽ��̴�: "+isPrime2(n));
		endTime = System.currentTimeMillis();
		System.out.println("�� ��° ��� ���ð�: "+(endTime-startTime)+"ms");
		startTime = 0;
		endTime = 0;

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