package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 10�� ¥�� �迭�� ���� �ؽ�Ʈ ���Ͽ��ִ� ���� �迭�� �߰��Ѵ�.
 * �迭�� ���ʴ�� ���� �ϸ鼭 �迭�� ������ ���� ���� ���Ѵ�.
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
			System.out.print("�迭 ù "+(j+1)+"�� ������ ��: ");
			m = m + a[j];
			System.out.println(m);
		}

		input.close();
	}

}




