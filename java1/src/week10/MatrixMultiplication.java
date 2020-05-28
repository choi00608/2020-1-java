package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixMultiplication {
	/**
	 * 두 행렬 을 텍스트로 읽어서 이차원 배열에 각각 저장한다
	 * 두행렬의 곱행렬을 구한다.
	 * 각 행렬들을 출력한다.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("matrix1.txt"));
		Scanner input2 = new Scanner(new File("matrix2.txt"));

		int[][] array1 = new int[3][5];
		int[][] array2 = new int[5][3];
		int[][] array3;

		for(int i = 0;i<=array1.length-1;i++) {
			for(int j = 0;j<=array1[0].length-1;j++) {
				array1[i][j] = input1.nextInt();
			}
		}

		for(int i = 0;i<=array2.length-1;i++) {
			for(int j = 0;j<=array2[0].length-1;j++) {
				array2[i][j] = input2.nextInt();
			}
		}

		array3 = multiply(array1,array1[0].length, array1.length,array2, array2.length );

		System.out.println("A 행렬");
		printMatrix(array1, array1.length, array1[0].length);
		System.out.println("");
		System.out.println("B 행렬");
		printMatrix(array2, array2.length, array2[0].length);
		System.out.println("");
		System.out.println("C = AB 행렬");
		printMatrix(array3, array3.length, array3[0].length);

	}
	/**
	 * 주어진 두 정수 행렬의 곱행렬을 구한다.
	 * @param a 첫행렬
	 * @param row 첫 행렬의 행 갯수
	 * @param col 첫 행렬의 열 갯수
	 * @param b 두 번째 행렬
	 * @param p 두 번쨰 행렬의 열 갯수
	 * @return
	 */
	public static int[][] multiply(int[][] a, int row, int col, int[][] b, int p){
		int[][] mul = new int [col][b[0].length];

		int temp = 0;
		int val = 0;

		for(int k = 0;k<=col-1;k++) {
			for(int j = 0;j<=b[0].length-1;j++) {
				for(int h = 0;h<=p-1;h++) {
					temp = (a[k][h])*(b[h][j]);
					val = val + temp;
				}
				mul[k][j] = val;
				val = 0;
			}
		}

		return mul;
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
}
