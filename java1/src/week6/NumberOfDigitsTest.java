package week6;
/**
 * �־��� ���� ���ڸ� �� ���� �˾Ƴ��� ���α׷�
 * int �� ����߱� ������ 10�ڸ��� �ִ���
 */
import java.util.Scanner;

public class NumberOfDigitsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �ڸ� ���� �˷��ݴϴ�.");
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.println("int Ÿ�� ���̾�� �ϰ� 0�� �ƴϾ�� �մϴ�.");

		int n =input.nextInt();

		System.out.println(numberOfDigits(n)+"�ڸ� �� �Դϴ�");
		input.close();
	}
	/**
	 * 10�� �ŵ����� ���� ����� �ش�.
	 * 10�� 0�ŵ������� 1�̴�.
	 * @param n �� �ŵ������� �� ������ �����Ѵ�. n�� 0 �̻� �����̿��� �Ѵ�.
	 * @return 10�� n�ŵ�������.
	 */
	public static int powerOfTen(int n) {
		int i;
		int temp = 1;
		for(i=1;i<n;i++) {
			temp*=10;
		}
		return temp;
	}
	/**
	 * �־��� ������ ���ڸ� ������ �˾Ƴ���.
	 * @param n �־��� ���� , 0�� �ƴϾ�� �Ѵ�.
	 * @return 0�� ���ڸ� ������.
	 */
	public static int numberOfDigits(int n) {
		int i;
		int share = 0;
		for(i=10;share==0;i--) {
			share = (n/powerOfTen(i-1));
			if(i==10&&share!=0) {
				return (10);
			}
		}
		return (i);
	}
}
