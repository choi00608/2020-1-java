package week6;
/**
 * Ű����κ��� ���� ������ �Է� �޴´�.
 * �Է¹��� �� ���� �ڰų� ���� �ִ� ������������ ã�� ����Ѵ�.
 */
import java.util.Scanner;

public class MaxSquareTest {

	public static void main(String[] args) {
		System.out.println("� ������ �۰ų� ���� �ִ� \"������ ������\"�� ã�����?");
		System.out.println("���� �ƴ� ������ �Է��Ͻÿ�.");
		System.out.println("������ �Է��ϸ� ���α׷��� ����˴ϴ�.");

		Scanner input = new Scanner(System.in);
		int n = 0;

		while(n>=0) {
			System.out.print("�Է�: ");
			n = input.nextInt();
			if(n<0) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(-1);
			}
			int maxSquare = maxSquare(n);
			System.out.println(n+"���� �۰ų� ���� �ִ� \"������ ������\"�� "+maxSquare+"�Դϴ�.");
		}
		input.close();
	}
	/**
	 * �־��� ���� �ƴ� ��������
	 * �۰ų� ����"������ ������"�� �� �ִ방�� ���Ѵ�.
	 * @param bound �־��� ����. (���� �ƴ� ����)
	 * @return �ִ� "������ ������".
	 */
	public static int maxSquare(int bound){
		int i;
		int square = 0;
		for(i=1;square<bound;i++) {
			square = i*i;	
			if(square>bound)
				return (i-1)*(i-1);
		}
		return square;
	}
}
