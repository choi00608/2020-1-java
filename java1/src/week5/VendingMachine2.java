package week5;
/**
 * 커피, 아이스크림, 음료 자판기 프로그램.
 * 연속적인 거래가 가능하다.
 * 메뉴선택 그 자체만 할 수 있다.
 * 각각 메뉴들은 함수를 따로두어서 간편하게 보이도록 했다.
 * 기능은 동일.
 */
import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("아이스크림, 커피, 음료를 파는 자판기 입니다.");
		int count=0;



		int item =0;

		while(count==0) {

			menu();

			int n= input.nextInt();

			switch(n) {
			case 1:
				ice();
				item = input.nextInt();
				System.out.println(item +" 선택, 감사합니다.");
				break;
			case 2:
				coffee();
				item = input.nextInt();
				System.out.println(item +" 선택, 감사합니다.");
				break;
			case 3:
				stuff();
				item = input.nextInt();
				System.out.println(item +" 선택, 감사합니다.");
				break;
			case 4:
				System.out.println("감사합니다.");
				count=1;
				break;
			default:
				System.out.println("올바르지 않은 번호 입니다.");
				break;

			}

		}
		input.close();
	}
	public static void menu() {
		System.out.println("어떤종류를 원하십니까?");
		System.out.println("아이스크림: 1");
		System.out.println("커         피: 2");
		System.out.println("음         료: 3");
		System.out.println("종         료: 4");
		System.out.print("번호   선택:  ");
	}
	public static void ice() {
		System.out.println("무엇을 드시겠습니까?");
		System.out.println("바닐라 아이스크림(1000원):");
		System.out.println("아몬드 아이스크림(1400원):");
		System.out.println("딸   기 아이스크림(1400원):");
		System.out.println("호   두 아이스크림(1400원):");
		System.out.print("번호선택:  ");
	}
	public static void coffee() {
		System.out.println("무엇을 드시겠습니까?");
		System.out.println("아메리카노(1000원):");
		System.out.println("카페라떼(1400원):");
		System.out.println("에스프레소(1400원):");
		System.out.print("번호선택:  ");
	}
	public static void stuff() {
		System.out.println("무엇을 드시겠습니까?");
		System.out.println("생수(1000원):");
		System.out.println("오렌지주스(1400원):");
		System.out.println("망고주스(1400원):");
		System.out.println("우유(1400원):");
		System.out.print("번호선택:  ");
	}

}