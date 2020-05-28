package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayUtil {

	/**
	 * 차례대로
	 * integers 텍스트 파일을 읽어서 3행5열의 이차원 배열을 만들어 출력한다.
	 * 10행 1열의 이차원 배열을 만들어서 난수로 채운 후 출력한다.
	 * 3행 2열의 이차원 배열을 만들어서 난수로 채운 후 출력한다.
	 * @author choi0
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));
		int table[][] = new int[3][5];
		int table2[][] = new int[1][10];
		int r[][] = new int[2][3];

		for (int i = 0;i<=2;i++) {
			for(int j = 0;j<=4;j++) {
				table[i][j] = input.nextInt();
			}
		}
		for(int k = 0;k<=9;k++) {
			table2[0][k]= (int)(10*(Math.random()));
		}
		printMatrix(table,3,5);
		System.out.println(" ");
		printMatrix(table2,1,10);
		System.out.println(" ");
		r = fillMatrixRandom(r,2,3,5);
		printMatrix(r,2,3);
		System.out.println(" ");
		input.close();
	}
	/**
	 * 주어진 이차원 배열의 원소를 차례로 출력한다.
	 * @param array	출력할 배열을 가리키는 참조변수
	 * @param rows	출력할 배열의 행 수.
	 * @param cols	출력할 배열의 열 수.
	 */
	public static void printMatrix(int[][]array, int rows, int cols) {


		for (int i = 0;i<=rows-1;i++) {
			for(int j = 0;j<=cols-1;j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	/**
	 * 이차원배열의 값들을 난수로 채워 넣는다.
	 * @param array2	출력할 배열을 가르킬 참조변수
	 * @param rows	행
	 * @param cols	열
	 * @param randomNumber 난수의 최대값
	 * @return
	 */
	public static int[][] fillMatrixRandom(int[][]array2, int rows, int cols, int randomNumber) {
		for (int i = 0;i<=rows-1;i++) {
			for(int j = 0;j<=cols-1;j++) {
				array2[i][j] = (int)(randomNumber*(Math.random()));
			}
		}
		return array2;
	}

}

