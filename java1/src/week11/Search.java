package week11;

public class Search {
	/**
	 * a메소드 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,2,3,2,5};

		System.out.println("linearSearch 테스트 ----------");

		System.out.print("배열 a: ");
		ArrayUtil.printArray(a, a.length);

		System.out.println("linear Search(a,a.length,5): "
				+ linearSearch(a,a.length,5));

		System.out.println("linear Search(a,1,1): "
				+ linearSearch(a,1,1));

		System.out.println("linear Search(a,4,5): "
				+ linearSearch(a,4,5));

		System.out.println("linear Search(a,1,2): "
				+ linearSearch(a,1,2));

		System.out.println("linear Search(a,a.length,2): "
				+ linearSearch(a,a.length,2));

		System.out.println("linear Search(a,0,5): "
				+ linearSearch(a,0,5));

		System.out.println("linear Search(a,a.length,4): "
				+ linearSearch(a,a.length,4));

		System.out.println();

		System.out.println("bianarySearch 테스트---------------");
		System.out.print("InsertionSort.sort(a, a.length): ");
		InsertionSort.sort(a, a.length);
		ArrayUtil.printArray(a, a.length);
		System.out.println();

		System.out.println("bianarySearch(a,a.length,5): "
				+ bianarySearch(a,a.length,5));
		System.out.println();

		System.out.println("bianarySearch(a,1,1): "
				+ bianarySearch(a,1,1));
		System.out.println();

		System.out.println("bianarySearch(a,4,5): "
				+ bianarySearch(a,4,5));
		System.out.println();

		System.out.println("bianarySearch(a,1,2): "
				+ bianarySearch(a,1,2));
		System.out.println();

		System.out.println("bianarySearch(a,a.length,2): "
				+ bianarySearch(a,a.length,2));
		System.out.println();

		System.out.println("bianarySearch(a,0,5): "
				+ bianarySearch(a,0,5));
		System.out.println();

		System.out.println("bianarySearch(a,a.length,4): "
				+ bianarySearch(a,a.length,4));
		System.out.println();

	}
	/**
	 * 선형탐색 함수
	 * 배열 x 의 앞 n개의 방에 key가 들어 있는가?
	 * @param x 배열
	 * @param n x의 앞 몇개의 방에서  key 를 찿을 것인가?
	 * @param key 찾을 데이터
	 * @return	key가 있으면 가장 작은 인데스값을 반환, 없으면 -1 반환
	 */
	public static int linearSearch(int[] x, int n, int key) {
		for (int i = 0;i < n;i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 이진탐색
	 * 전제조건: 배열 x 가 이미 오름차순으로 정렬되어있어야 함
	 * 배열에는 데이터가 꽉 차 있지 않을 수 있다.
	 * @param x 정렬된 정수 배열
	 * @param n x에 들어있는 데이터의 개수
	 * @param key 찾을 데이터
	 * @return
	 */
	public static int bianarySearch(int[] x , int n, int key) {

		int lo = 0; 
		int  hi = n-1;
		int  mid;

		while (hi >= lo) {
			mid  = (hi + lo) / 2;
			if (key == x[mid])
				return mid;
			if (key < x[mid])
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return -1;
	}

}
