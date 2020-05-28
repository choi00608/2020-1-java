package week10;

import java.util.Scanner;

public class TablePlusArray {
	/**
	 * 2차원행을 만드는데, 
	 * 만들 배열의 핵과 열을 입력받아 크기를 정한다
	 * 배열을 채울 난수들의 퇴대값을 입력받는다
	 * 완성된 2차원배열의 가로합과 세로합을 구한다.
	 * 각각 배열과 가로세로합을 표 형태로 출력한다.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("행의 수: ");
		int row = input.nextInt();

		System.out.print("열의 수: ");
		int col = input.nextInt();

		System.out.print("난수의 최대값: ");
		int n = input.nextInt()+1;

		int[][] table = new int [col][row];

		System.out.println("");
		System.out.println("초기배열");
		display(table, col, row);

		System.out.println("");
		table = random(table, col, row, n);
		System.out.println("난수가 저장된 배열");
		display(table, col, row);

		System.out.println(" ");

		int[] rowSum = new int[row];
		rowSum = calculateRowSums(table, col, row, rowSum);
		int[] colSum = new int[col];
		colSum = calculateColSums(table, col, row, colSum);

		int total = (arraySum(colSum)+arraySum(rowSum));

		System.out.println("가로, 세로, 합이 계산된 배열");
		displayAll(table, col, row, colSum, rowSum, total);

		input.close();
	}
	/**
	 * 주어진 배열을 출력한다.
	 * @param b1
	 */
	public static void printArray(int []b1) {
		for(int i = 0;i<=b1.length-1;i++) {
			System.out.print(b1[i]);
			System.out.print("\t");
		}
	}
	/**
	 * 주어진배열의 원소들의 합을 구한다.
	 * @param a1
	 * @return 원소들의 합
	 */
	public static int arraySum(int []a1) {
		int sum = 0;
		for(int i = 0;i<=a1.length-1;i++) {
			sum+=a1[i];
		}
		return sum;
	}
	/**
	 * 입력된 이차원배열을 출력한다.
	 * @param table 출력될 배열
	 * @param col 열
	 * @param row 행
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
	 * 만들어진 이차원 배열에 입력한 난수 이하의 값들로 채워넣는다.
	 * @param table	받아서 값을 채워넣을 이차원 배열
	 * @param col	행
	 * @param row	열
	 * @param max	최대 난수 값 
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
	 * 2차원 배열 table 의 가로 합을 구해 rowSum에 저장한다.
	 * @param table	2차원배열
	 * @param col	table의 열 수 
	 * @param row	table의 행 수 
	 * @param rowSum	각 행의 가로합을 저장할 배열
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
	 * 2차원 배열 table 의 세로합을 구해 colSum에 저장한다.
	 * @param table	2차원배열
	 * @param col	table의 열 수 
	 * @param row	table의 행 수 
	 * @param colSum	각 열의 세로합을 저장할 배열
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
	 * 원래의 데이터가 들어있는 2차원배열, 가로합 배열, 총합
	 * 을 표 형태로 출력한다.
	 * @param table 원래데이터가 들어있는 2차원 배열
	 * @param col	행 수 
	 * @param row	열 수 
	 * @param colSum	세로합의 배열
	 * @param rowSum	가로합의 배열
	 * @param total	총합
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
