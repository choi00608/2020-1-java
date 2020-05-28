package week9;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * 10�� ¥�� �迭�� ���� �ؽ�Ʈ ���Ͽ��ִ� ���� �迭�� �߰��Ѵ�.
 * ���� �迭�� �������� �ٸ� �ؽ�Ʈ ���Ϸ� ���� �����Ѵ�.
 * @author choi0
 *
 */
public class FileInFileOut {


	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers.txt"));
		PrintWriter output = new PrintWriter("reversedIntegers.txt");
		int [] a = new int[10];
		int i = 0;
		while(input.hasNextInt()){
			a[i] = input.nextInt();
			i++;
		}
		System.out.println("�迭�� �������� ���: ");
		for(int j=a.length - 1;j>=0;j--) {
			output.print(a[j] + " ");
		}

		input.close();
		output.close();
	}

}


