package week5;
/**
 * 1���� 1���� �ڿ����� ��.
 * 1���� 2���� �ڿ����� ��.
 * 1���� 3���� �ڿ����� ��.
 * .
 * .
 * .
 * .
 * 1���� 20���� �ڿ����� ��.
 * ���Ͱ��� ����ϴ� ���α׷��̴�.
 * @author choi0
 *
 */
public class Summations {

	public static void main(String[] args) {

		int to=1;
		int sum;
		while(to<=20) {
			sum= suma(to);
			System.out.println("1���� "+to+"������ �ڿ����� �� = "+sum);
			to++;
		}

	}
	public static int suma(int upto) {
		int i;
		int n=upto;
		for(i=1;i<n;i++) {
			upto=upto+i;

		} 
		return upto;
	}
}
