package week5;
/**
 * ������ �� ���� �� ���� �Է��ϸ� �� ���� �ȿ� �ִ� ¦������ ���� ���ϴ� ���α׷��̴�.
 * ū ���ڸ� ���� �Է��ص� ��ġ�� �ٲپ� �ֱ� ������, �������� ����� �����ϴ�
 * 0 0�� �Է��ϸ� ���α׷��� ����ȴ�.
 * @author choi0
 *
 */
import java.util.Scanner;

public class EvensSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ������ ¦������ ����  ���մϴ�.");
		System.out.print("�� ���� ������ �Է��Ͻÿ�: ");
		int from=input.nextInt();
		int to=input.nextInt();
		if(from==0) {
			if(to==0) {
				System.out.println("�����մϴ�. ���α׷��� ��Ĩ�ϴ�");
				System.exit(-1);
			}
		}
		if(from>to) {
			int temp=from;
			from=to;
			to=temp;
		}

		int sum;
		sum= suma(from,to);
		System.out.println(from+"���� "+to+"������ ¦���� �� = "+(sum-from));

		from=from+10;
		to=to+10;


		input.close();
	}
	/**
	 * �ΰ��� �� �� ������ �޾Ƽ� 
	 * ¦���� ��� ���ϴ� �����̴���ִ� �Լ��̴�.
	 * @author choi0
	 *
	 */

	public static int suma(int sn, int ln) {
		int i;
		int tn=ln;
		for(i=sn;i<=tn;i++) {
			if(i%2==0) {
				sn=sn+i;
			}

		} 
		return sn;
	}
}