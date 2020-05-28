package week9;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * 10개 짜리 배열을 만들어서 텍스트 파일에있는 값을 배열에 추가한다.
 * 그후 배열을 역순으로 다른 텍스트 파일로 만들어서 저장한다.
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
		System.out.println("배열을 역순으로 출력: ");
		for(int j=a.length - 1;j>=0;j--) {
			output.print(a[j] + " ");
		}

		input.close();
		output.close();
	}

}


