package week10;

import java.util.Scanner;

public class Table {
	/**
	 * 2�������� ����µ�, 
	 * ���� �迭�� �ٰ� ���� �Է¹޾� ũ�⸦ ���Ѵ�
	 * �迭�� ä�� �������� ��밪�� �Է¹޴´�
	 * �ϼ��� 2�����迭�� �����հ� �������� ���Ѵ�.
	 * ���� �迭�� ���μ������� ���� �迭�� ǥ ���·� ���� �߰��Ѵ�.
	 * ������ �迭�� ����Ѵ�.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("���� ��: ");
		int row = input.nextInt();

		System.out.print("���� ��: ");
		int col = input.nextInt();

		System.out.print("������ �ִ밪: ");
		int n = input.nextInt()+1;

		int[][] table = new int [col][row];

		System.out.println("");
		System.out.println("�ʱ�迭");
		display(table, col, row);
		System.out.println("");

		table = random(table, col, row, n);

		System.out.println("������ ����� �迭");
		display(table, col, row);
		System.out.println(" ");

		System.out.println("����, ����, ���� ���� �迭");
		total(table); 
		input.close();
	}
	/**
	 * �־��� �迭�� ����Ѵ�.
	 * @param b1
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print("\t");
		}
	}
	/**
	 * �־����迭�� ���ҵ��� ���� ���Ѵ�.
	 * @param a1
	 * @return ���ҵ��� ��
	 */
	public static int arraySum(int []a1) {
		int sum = 0;
		for(int i = 0;i<=a1.length-1;i++) {
			sum+=a1[i];
		}
		return sum;
	}
	/**
	 * �Էµ� �������迭�� ����Ѵ�.
	 * @param table ��µ� �迭
	 * @param col ��
	 * @param row ��
	 */
	public static void display(int[][] table, int col, int row) {

		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				System.out.print(table[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	/**
	 * ������� ������ �迭�� �Է��� ���� ������ ����� ä���ִ´�.
	 * @param table	�޾Ƽ� ���� ä������ ������ �迭
	 * @param col	��
	 * @param row	��
	 * @param max	�ִ� ���� �� 
	 * @return
	 */
	public static int[][] random(int[][]table, int col, int row, int max) {
		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				table[i][j] = (int)(max*(Math.random()));
			}
		}
		return(table);
	}
	/**
	 * ���� �迭�� ������, �������� ���Ѵ�
	 * ���� �����հ� �������� ���� �迭�� ǥ �������� �߰��Ͽ� �迭�� ���� �ø���
	 * ���� ���� �߰��� �迭�� ����Ѵ�.
	 * @param a
	 */
	public static void total(int[][] a) {

		int[][] total = new int[a.length+1][a[0].length+1];

		for (int i = 0;i<=a.length-1;i++) {
			for(int j = 0;j<=a[0].length-1;j++) {
				total[i][j] = a[i][j];
			}
		}

		int rowSum = 0;
		int temp = 0;

		for (int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				rowSum += a[i][j];

			}
			total[i][a[0].length] = rowSum;
			temp += rowSum;
			rowSum = 0;
		}

		int [] colSum = new int [a[0].length];

		for (int i = 0;i<=a.length-1;i++) {
			for(int j = 0;j<=a[0].length-1;j++) {
				colSum[j] += a[i][j];
			}
		}

		for(int h = 0;h<a[0].length;h++) {
			total[a.length][h] = colSum[h];
		}
		total[total.length-1][total[0].length-1] = arraySum(colSum)+temp;
		display(total,total.length, total[0].length);

	}
}
