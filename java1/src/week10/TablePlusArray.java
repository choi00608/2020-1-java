package week10;

import java.util.Scanner;

public class TablePlusArray {
	/**
	 * 2�������� ����µ�, 
	 * ���� �迭�� �ٰ� ���� �Է¹޾� ũ�⸦ ���Ѵ�
	 * �迭�� ä�� �������� ��밪�� �Է¹޴´�
	 * �ϼ��� 2�����迭�� �����հ� �������� ���Ѵ�.
	 * ���� �迭�� ���μ������� ǥ ���·� ����Ѵ�.
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

		int[] rowSum = new int[row];
		rowSum = calculateRowSums(table, col, row, rowSum);
		int[] colSum = new int[col];
		colSum = calculateColSums(table, col, row, colSum);

		int total = (arraySum(colSum)+arraySum(rowSum));

		System.out.println("����, ����, ���� ���� �迭");
		displayAll(table, col, row, colSum, rowSum, total);

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
	 * 2���� �迭 table �� ���� ���� ���� rowSum�� �����Ѵ�.
	 * @param table	2�����迭
	 * @param col	table�� �� �� 
	 * @param row	table�� �� �� 
	 * @param rowSum	�� ���� �������� ������ �迭
	 * @return
	 */
	public static int[] calculateRowSums(int[][] table, int col, int row, int[] rowSum) {
		rowSum = new int [col];

		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				rowSum[i] = rowSum[i] + table[i][j];
			}
		}
		return(rowSum);
	}
	/**
	 * 2���� �迭 table �� �������� ���� colSum�� �����Ѵ�.
	 * @param table	2�����迭
	 * @param col	table�� �� �� 
	 * @param row	table�� �� �� 
	 * @param colSum	�� ���� �������� ������ �迭
	 * @return
	 */
	public static int[] calculateColSums(int[][] table, int col, int row, int[] colSum) {
		colSum = new int [row];

		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				colSum[j] = colSum[j] + table[i][j];
			}
		}
		return(colSum);
	}
	/**
	 * ������ �����Ͱ� ����ִ� 2�����迭, ������ �迭, ����
	 * �� ǥ ���·� ����Ѵ�.
	 * @param table ���������Ͱ� ����ִ� 2���� �迭
	 * @param col	�� �� 
	 * @param row	�� �� 
	 * @param colSum	�������� �迭
	 * @param rowSum	�������� �迭
	 * @param total	����
	 */
	public static void displayAll(int[][] table, int col, int row, int[]colSum, int[]rowSum, int total) {


		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				System.out.print(table[i][j]);
				System.out.print("\t");
			}
			System.out.print("|\t" + rowSum[i]);
			System.out.println("");
		}
		System.out.println(" ");
		printArray(colSum);
		System.out.print("|\t"+total);
	}
}
