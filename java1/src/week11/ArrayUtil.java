package week11;

public class ArrayUtil {
	/**
	 * 메소드 테스트
	 * @param args
	 */
	public static void main(String[]args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		System.out.println("printArray 메소드 테스트 -----------");

		System.out.print("printArray(a,0): ");
		printArray(a,0);

		System.out.print("printArray(a,1): ");
		printArray(a,1);

		System.out.print("printArray(a,a.length): ");
		printArray(a,a.length);

		System.out.print("printArray(a,a.length+1): ");
		printArray(a,a.length+1);

		System.out.print("printArray(a,-1): ");
		printArray(a,-1);

		System.out.println();

		System.out.println("fillRandom 메소드 테스트 ----------");

		System.out.print("fillRandom(a,10): ");
		fillRandom(a,10);
		printArray(a,a.length);

		System.out.print("fillRandom(a,100): ");
		fillRandom(a,100);
		printArray(a,a.length);

		System.out.print("fillRandom(a,2): ");
		fillRandom(a,2);
		printArray(a,a.length);

		System.out.print("fillRandom(a,1): ");
		fillRandom(a,1);
		printArray(a,a.length);

		System.out.println();

		System.out.println("distict 메소드 테스트----------------");

		int[] a2 = {1,1,2};

		System.out.println("a2 = {1,1,2}");

		System.out.println("distinct(a2,1): " 
				+ distinct(a2,1));

		System.out.println("distinct(a2,2): " 
				+ distinct(a2,2));

		System.out.println("distinct(a2,a2.length): " 
				+ distinct(a2,a2.length));

		System.out.println("distinct(a2,a2.length+1): " 
				+ distinct(a2,a2.length+1));

		System.out.println("distinct(a2,0): " 
				+ distinct(a2,0));

		System.out.println("distinct(a2,-1): " 
				+ distinct(a2,-1));

		System.out.println();

		int[] a3 = {1,2,3};

		System.out.println("a3 = {1,2,3}");

		System.out.println("distinct(a3,a3.length): " 
				+ distinct(a3,a3.length));

		System.out.println("distinct(a3,a3.length+1): " 
				+ distinct(a3,a3.length+1));

		System.out.println();

		int[] a4 = {1};

		System.out.println("a4 = {1}");

		System.out.println("distinct(a4,a4.length): " 
				+ distinct(a4,a4.length));

		System.out.println("distinct(a3,a3.length+1): " 
				+ distinct(a4,a4.length+1));

		System.out.println();

		int[] a5 = {};

		System.out.println("a5 = {}");

		System.out.println("distinct(a5,a5.length): " 
				+ distinct(a5,a5.length));

		System.out.println("distinct(a5,a5.length+1): " 
				+ distinct(a5,a5.length+1));

		System.out.println();

		System.out.println("fillRandomDistinct 메소드 테스트------------");

		System.out.println("크기가 10인 배열 a");

		System.out.print("fillRandomDistinct(a,10): ");
		fillRandomDistinct(a, 10);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,100): ");
		fillRandomDistinct(a, 100);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,1): ");
		fillRandomDistinct(a, 1);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,0): ");
		fillRandomDistinct(a, 0);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		System.out.print("fillRandomDistinct(a,-1): ");
		fillRandomDistinct(a, -1);
		printArray(a, a.length);
		System.out.println("distinct? :" + distinct(a, a.length));
		System.out.println();

		int[] a6 = new int[1];

		System.out.print("fillRandomDistinct(a6,1): ");
		fillRandomDistinct(a6, 1);
		printArray(a6, a6.length);
		System.out.println("distinct? :" + distinct(a6, a6.length));
		System.out.println();

		int[] a7 = new int[0];

		System.out.print("fillRandomDistinct(a7,0): ");
		fillRandomDistinct(a7, 0);
		printArray(a7, a7.length);
		System.out.println("distinct? :" + distinct(a7, a7.length));
		System.out.println();

		System.out.println("makeArray 메소드 테스트 --------------");

		System.out.print("make RandomArray(10,10): ");
		printArray(makeRandomArray(10,10),10);

		System.out.print("make RandomArray(10,1): ");
		printArray(makeRandomArray(10,1),10);

		System.out.print("make RandomArray(1,10): ");
		printArray(makeRandomArray(1,10),1);

		System.out.print("make RandomArray(1,0): ");
		printArray(makeRandomArray(1,0),1);

		System.out.print("make RandomArray(0,0): ");
		printArray(makeRandomArray(0,0),1);

		System.out.print("make RandomArray(-1,0): ");
		printArray(makeRandomArray(-1,0),1);

	}
	/**
	 * 배열과  그 배열을 출력할 개수를 받아 
	 * 원하는 만큼 배열의 값을 출력한다.
	 * @param a 출력할 배열
	 * @param n 출력할 원소의 개수
	 */
	public static void printArray(int[] a, int n) {

		if (n > a.length) {
			n = a.length;
		}

		if (n>0) {
			for (int i = 0; i < n;i++) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	/**
	 * 배열을 받아서 그 배열을 주어진 값만큼을 한계로 하는 난수들로 채워 넣는다.
	 * 중복가능
	 * @param list 난수로 채울 배열
	 * @param uBound 난수의 최대값
	 */
	public static void fillRandom(int[] list, int uBound) {
		for (int i = 0;i<list.length;i++) {
			list[i] = (int)((uBound)*Math.random());
		}
	}
	/**
	 * 배열을 받아들여서
	 * 그 배열에 중복되는 값이 있는지 판단한다.
	 * 중복이 없으면 true, 
	 * 중복이 있으면 false 를 반환한다.
	 * @param a 배열
	 * @param n 배열의 어디까지 확인할 것인가
	 * @return
	 */
	public static boolean distinct(int[] a, int n) {

		if (n > a.length) {
			n = a.length;
		}

		for (int j = 0;j < n;j++) {
			for (int i = 0;i < n;i++) {
				if ((a[j] == a[i])&&(j!=i)) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 배열과 난수의 최대값을 받아서 배열들을 난수로 채운다.
	 * 중복되는숫자가 없어야 하기 때문에
	 * uBound >= list.length
	 * 라는 전제조건이 붙는다.
	 * @param list 배열
	 * @param uBound 난수의 최대값
	 */
	public static void fillRandomDistinct(int[] list, int uBound) {

		boolean d = false;

		if (uBound >= list.length) {

			for (int i = 0;i<list.length;i++) {
				list[i] = (int)((uBound)*Math.random());
			}

			while(d == false) {

				for (int j = 0;j < list.length;j++) {
					for (int i = 0;i < list.length;i++) {
						if ((list[j] == list[i])&&(j!=i)) {
							list[j] = (int)((uBound)*Math.random());
						}
					}
				}

				if(distinct(list, list.length) == true) {
					d = true;
				}


			}

		}
		if (d==false) {
			System.out.print("uBound >= list.length 이어야 합니다."
					+ " 배열의 내용이 변하지 않았습니다.");
			System.out.println();
		}
	}
	/**
	 * 만들 배열의 크기를 받아 
	 * 크기가 n 인 배열을 만들고 uBound값을 받아들여
	 * 난수의최대값으로 설정하고 배열을 채워넣는다 
	 * @param n 배열의 크기
	 * @param uBound 난수의 최대값
	 * @return 만들어진 배열
	 */
	public static int[] makeRandomArray(int n, int uBound) {

		if(n<0) {

			System.out.println("배열의 크기는 음수일 수 없습니다.");
		}

		int[] a = new int[n];

		for (int i = 0;i<a.length;i++) {
			a[i] = (int)((uBound)*Math.random());
		}

		return a;
	}


}
