package week3;

import java.util.Scanner;

public class Increase {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ �ϳ� �Է��Ͻÿ�: ");

		int n =input.nextInt(); 
		input.close();

		System.out.println("ù��° ���");
		int i;
		for(i=0;i<=n;i++){

			if(i%10==9) {
				System.out.print("\n");
			}

			System.out.print(i +"\t");
		}
		System.out.print("\n");
		System.out.println("�ι�° ���");
		int count = 0;
		for(i=0;i<=n;i++){
			System.out.print(i +"\t");
			count = count + 1;
			if(count==10) {
				System.out.print("\n");
				count = 0;
			}

		}
	}
}