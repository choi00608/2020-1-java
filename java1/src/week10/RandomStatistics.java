package week10;

public class RandomStatistics {
	/**
	 * 크기가10인 배열을 만들어서
	 * 100보다 작은 난수로 배열을 채운다.
	 * 배열의 원소들 중 최대, 최소, 평균값을 각각 출력한다.
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int [10];

		writeRandomNumbers(array, 100);

	}
	/**
	 * 0이상 n 미만의 정수 난수를 발생시켜 배열 a를 차례로 채운다.
	 * @param a 난수를 저장할 배열
	 * @param n 0이상 n 미만난수 발생
	 */
	public static void writeRandomNumbers(int[] a, int n) {
		System.out.println("100보다 작은 난수");
		for(int i =0;i<=a.length-1;i++) {
			a[i] = (int)(n*(Math.random()));
			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println("원소들 중 최소값: " + min(a));
		System.out.println("원소들 중 최대값: " + max(a));
		System.out.println("원소들의 평균값: " + average(a));
	}
	/**
	 * 배열 a의 원소 중 최소값을 찹아 반환한다
	 * @param a 배열을 가리키는 참조변수
	 * @return 최소값
	 */
	public static int min(int[] a) {
		for(int i=0 ; i<a.length; i++) {
			for(int j=i+1 ; j<a.length; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		return(a[0]);
	}
	/**
	 * 배열 a의 원소 중 최대값을 찹아 반환한다
	 * @param a 배열을 가리키는 참조변수
	 * @return 최대값
	 */
	public static int max(int[] a) {
		for(int i=0 ; i<a.length; i++) {
			for(int j=i+1 ; j<a.length; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		return(a[a.length-1]);
	}
	/**
	 * 배열a의 원소들의 평균값을 반환한다.
	 * @param a배열을 가르키는 참조변수
	 * @return 평균값
	 */
	public static double average(int[] a) {
		int sum = 0;
		for(int i =0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		return(sum/a.length);
	}

}
