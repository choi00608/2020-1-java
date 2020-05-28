package week9;


public class RandomNumbers2 {
	/**
	 * 10개짜리 배열을 만들어서 0이상 100미만의 난수를 배열에 추가한다.
	 * for문을 사용하여 배열을 오름차순으로 정렬하고
	 * 배열의 최소, 최대값을 각각 출력한다
	 * 배열의 평균값을 출력한다.
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = new int[10];
		int n = 0;
		double sum = 0;
		System.out.println("100보다 작은 정수난수:");
		for(int i =0;i<=9;i++) {
			a[i] = (int)(100*(Math.random()));
			System.out.println(a[i]);
			n++;
			sum = sum + a[i];
		}
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n ; j++) { 
				if (a[i] >a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		System.out.println(" ");
		System.out.println("원소들 중 최소값:" + a[0]);
		System.out.println("원소들 중 최대값:" + a[n-1]);
		System.out.println("원소들의 평균값:" + (sum/n));
	}

}


