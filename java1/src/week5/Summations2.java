package week5;
/**
 * 10���� 20���� �ڿ����� ��.
 * 20���� 30���� �ڿ����� ��.
 * 30���� 40���� �ڿ����� ��.
 * .
 * .
 * .
 * .
 * 90���� 100���� �ڿ����� ��.
 * ���Ͱ��� ����ϴ� ���α׷��̴�.
 * @author choi0
 *
 */
public class Summations2 {

	public static void main(String[] args) {
		int from=10;
		int to=20;

		int sum;
		while(to<=100) {
			sum= suma(from,to);
			System.out.println(from+"���� "+to+"������ �ڿ����� �� = "+(sum-from));

			from=from+10;
			to=to+10;



		}

	}
	/**
	 * 10�� �þ�� ������ �޾Ƽ� �������� ������ ���� ���ϴ� �Լ��̴�.
	 * @author choi0
	 *
	 */
	public static int suma(int sn, int ln) {
		int i;
		int tn=ln;
		for(i=sn;i<=tn;i++) {
			sn=sn+i;

		} 
		return sn;
	}
}
