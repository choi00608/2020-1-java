package week11;

import java.util.Scanner;

public class MemoryGame {
	/**
	 * �� ���� ������ ���� ����� ����ڰ� �Է��ϸ�
	 * �� ����ŭ�� ũ�⸦ ���� �迭�� ������ ��
	 * �� �迭�� ���� �ٸ� (�ߺ��� ���ڰ� ������) ������ ä���.
	 * �迭�� �ִ� �������� ȭ�鿡 �����ְ�
	 * ����ڰ� 1�� �Է��ϸ� ȭ�鿡 ���� ���ڸ� 100ȸ ����Ͽ�
	 * ȭ���� �о� �ø��� ����ϰ� �ִ� ���ڵ��� �Է��ϵ��� �ȳ��Ѵ�.
	 * ����ڰ� ����ϰ� �ִ� ���ڵ��� �Է��� �� ������ �Է��ϸ�
	 * �� ���ڵ��� �� �ٸ� �迭�� �����ϰ� ����ڰ� ���ڸ� �� ���� �Է��ߴ��� ����Ѵ�.
	 * ����ڰ� �Է��� ���ڰ� ���� �迭 �߿� �� ���� �ִ��� �˻��Ͽ� ����� ����Ѵ�. 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list;
		int listLength;

		System.out.println("�� ���� �������� ���ðڽ��ϱ�? ");
		listLength = input.nextInt();

		list = new int[listLength];
		ArrayUtil.fillRandomDistinct(list, 100);

		for (int i = 0; i< list.length; i++) {
			System.out.println(list[i]);

		}

		System.out.println("1�� �Է��ϸ� ���ڸ� ����ϴ�.");
		input.hasNextInt();
		for(int i = 0; i<100; i++) {
			System.out.println();
		}

		System.out.println("� ���ڵ��� �־����� ���纸����.");
		System.out.println("�Է��� �������� ������ �Է��ϼ���.");

		int[] temp = new int[0];

		int n;

		while (input.hasNextInt() == true) {

			n = input.nextInt();

			if(n<0) {
				break;
			}

			temp = append(temp,n);
		}

		int num = checkAnswers(list,temp,temp.length);

		System.out.println(num + "�� ������ϴ�.");

		input.close();
	}
	/**
	 * ����ڰ� �Է��� �������� list�� ��� ����ִ��� �˾Ƴ�
	 * list���� �������� �� ���ִ�.
	 * answer �迭���� ���� �Ϻκи� ����ڰ� �Է��� ���� ��� ���� �� �ִ�.
	 * @param list ���δٸ� ������ ����ִ� �迭
	 * @param answer ����ڰ� �Է��� �������� ����ִ� �迭
	 * @param answerNumber answer�� ����ִ� ���� ����
	 * @return ����ڰ� �Է��� �������� list�� ��� ����ִ���
	 */
	public static int checkAnswers(int[] list, int[] answer, int answerNumber) {

		int count = 0;

		for(int i = 0; i < answer.length;i++) {
			if (Search.linearSearch(list, list.length, answer[i]) >= 0) {
				count++;
			}

		}

		return count;
	}
	/**
	 * �迭�� ���� �߰����ִ� �Լ�
	 * @param a ���� �߰� �� �迭
	 * @param n �߰��� ��
	 * @return ���� �߰��� �迭
	 */
	public static int[] append(int[]a,int n) {

		int[] b = new int[a.length+1];

		for(int i = 0; i < a.length;i++) {
			b[i] = a[i];
		}

		b[b.length-1] = n;

		return b;
	}
}


