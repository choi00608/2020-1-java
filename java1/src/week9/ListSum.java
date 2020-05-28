package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 10개 짜리 배열을 만들어서 텍스트 파일에있는 값을 배열에 추가한다.
 * 배열을 차례대로 나열 하면서 배열의 값보다 낮은 값을 더한다.
 * @author choi0
 *
 */
public class ListSum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers.txt"));
		int [] a = new int[10];
		int i = 0;
		while(input.hasNextInt()){
			a[i] = input.nextInt();
			i++;
		}
		int m = 0;
		for(int j=0;j<=a.length - 1;j++) {
			System.out.print("배열 첫 "+(j+1)+"개 원소의 합: ");
			m = m + a[j];
			System.out.println(m);
		}

		input.close();
	}

}




