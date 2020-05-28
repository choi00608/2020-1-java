package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixTranspose {
	/**
	 * integers15 텍스트 파일로 부터 숫자를 읽어서 3x5 이차원배열을 만든다.
	 * 만든 행렬의 전치행렬을 구한다.
	 * 두 행렬을 출력한다.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));

		int[][] array = new int [3][5];
		int[][] transArray;

		for(int i = 0;i<=array.length-1;i++) {
			for(int j = 0;j<=array[0].length-1;j++) {
				array[i][j] = input.nextInt();
			}
		}
		System.out.println("원래의 행렬");
		printMatrix(array,array.length,array[0].length);
		System.out.println("");
		System.out.println("전치행렬");
		transArray = transpose(array,array.length,array[0].length);
		printMatrix(transArray,transArray.length,transArray[0].length);

	}
	/**
	 * 받아들인 이차원 배열을 차례대로 출력한다.
	 * @param array 출력한 배열
	 * @param col	행
	 * @param row	열
	 */
	public static void printMatrix(int[][]array, int col, int row) {


		for (int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				System.out.print(array[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	/**
	 * 읽어들인 행렬을 받아들인다
	 * 받아들인 행렬의 전치 행렬을 구한다.
	 * @param array 받아들인행렬
	 * @param row	열
	 * @param col	행
	 * @return	전치행렬 
	 */
	public static int[][] transpose(int[][]array, int row, int col) {

		int [][] a1 = new int [col][row];

		for(int i = 0;i<=col-1;i++) {
			for(int j = 0;j<=row-1;j++) {
				a1[i][j] = array[j][i];
			}
		}
		return a1;
	}
}