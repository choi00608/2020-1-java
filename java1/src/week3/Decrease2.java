package week3;

import java.util.Scanner;

public class Decrease2 {


	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �ϳ� �Է��Ͻÿ�: ");
		int n = input.nextInt();
		input.close();

		System.out.println("ù��° ���");

		int i;
		for(i=n;i>=0;i--){

			if(i%10==n%10) {
				if(n!=0) {
					System.out.print("\n");
				}
			}

			System.out.print(i +"\t");

		}

		System.out.print("\n");
		System.out.println("�ι�° ���");

		int count = 0;
		for(i=n;i>=0;i--){

			System.out.print(i +"\t");
			count = count + 1;

			if(count==10) {
				System.out.print("\n");
				count = 0;
			}

		}
	}
}
