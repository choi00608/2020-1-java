package week11;

import java.util.Scanner;

public class MemoryGame {
	/**
	 * 몇 개의 정수를 볼지 물어보고 사용자가 입력하면
	 * 그 수만큼의 크기를 갖는 배열을 구성한 후
	 * 이 배열에 서로 다른 (중복된 숫자가 없도록) 난수를 채운다.
	 * 배열에 있는 난수들을 화면에 보여주고
	 * 사용자가 1을 입력하면 화면에 새줄 문자를 100회 출력하여
	 * 화면을 밀어 올리고 기억하고 있는 숫자들을 입력하도록 안내한다.
	 * 사용자가 기억하고 있는 숫자들을 입력한 후 음수를 입력하면
	 * 이 숫자들을 또 다른 배열에 저장하고 사용자가 숫자를 몇 개나 입력했는지 기억한다.
	 * 사용자가 입력한 숫자가 난수 배열 중에 몇 개나 있는지 검사하여 결과를 출력한다. 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list;
		int listLength;

		System.out.println("몇 개의 정수들을 보시겠습니까? ");
		listLength = input.nextInt();

		list = new int[listLength];
		ArrayUtil.fillRandomDistinct(list, 100);

		for (int i = 0; i< list.length; i++) {
			System.out.println(list[i]);

		}

		System.out.println("1을 입력하면 숫자를 감춥니다.");
		input.hasNextInt();
		for(int i = 0; i<100; i++) {
			System.out.println();
		}

		System.out.println("어떤 숫자들이 있었는지 맟춰보세요.");
		System.out.println("입력을 끝내려면 음수를 입력하세요.");

		int[] temp = new int[0];

		int n;

		while (input.hasNextInt() == true) {

			n = input.nextInt();

			if(n<0) {
				break;
			}

			temp = append(temp,n);
		}

		int num = checkAnswers(list,temp,temp.length);

		System.out.println(num + "개 맞췄습니다.");

		input.close();
	}
	/**
	 * 사용자가 입력한 정수들이 list에 몇개나 들어있는지 알아냄
	 * list에는 난수들이 꽉 차있다.
	 * answer 배열에는 앞의 일부분만 사용자가 입력한 답이 들어 있을 수 있다.
	 * @param list 서로다른 난수가 들어있는 배열
	 * @param answer 사용자가 입력한 정수들이 들어있는 배열
	 * @param answerNumber answer에 들어있는 정수 개수
	 * @return 사용자가 입력한 정수들이 list에 몇개나 들어있는지
	 */
	public static int checkAnswers(int[] list, int[] answer, int answerNumber) {

		int count = 0;

		for(int i = 0; i < answer.length;i++) {
			if (Search.linearSearch(list, list.length, answer[i]) >= 0) {
				count++;
			}

		}

		return count;
	}
	/**
	 * 배열에 값을 추가해주는 함수
	 * @param a 값을 추가 할 배열
	 * @param n 추가할 값
	 * @return 값이 추가된 배열
	 */
	public static int[] append(int[]a,int n) {

		int[] b = new int[a.length+1];

		for(int i = 0; i < a.length;i++) {
			b[i] = a[i];
		}

		b[b.length-1] = n;

		return b;
	}
}


