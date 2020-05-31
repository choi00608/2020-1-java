package week11;

public class UnionIntersection {
	/**
	 * 배열 a의 원소들과 배열 b의 원소들의 합집합을
	 * 배열 union에 넣고 합집합의 원소의 수를 반환한다.
	 * 전제조건: union,length >= a.length + b.length
	 * @param a 배열
	 * @param b 배열
	 * @return 합집합의 원소의 개수
	 */
	public static int unionArrays(int[]a, int[]b, int[] union) {

		int count = 0;

		for(int i = 0; i<a.length;i++) {
			union[i] = a[i];
			count++;
		}

		boolean distinct = true;
		for (int j = 0;j < b.length;j++) {
			for (int h = 0;h < a.length;h++) {
				if ((b[j] == a[h])) {
					distinct = false;
				}
			}
			if(distinct == true) {
				union[count] = b[j];
				count++;
			}
			distinct = true;
		}
		return count;

	}
	/**
	 * 배열 a의 원소들과 배열 b의 원소들의 교집합을
	 * 배열intersection에 넣고 교집합의 원소의 수를 반환한다.
	 * 전제조건: intersection.length >= min(a.length, b.length)
	 * 
	 * @param a 배열
	 * @param b 배열
	 * @return 교집합의 원소의 개수
	 */
	public static int intersectionArrays(int[] a, int[] b, int[] intersection) {

		int count = 0;

		for (int j = 0;j < b.length;j++) {
			for (int h = 0;h < a.length;h++) {
				if ((b[j] == a[h])) {
					intersection[count] = b[j];
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * 난수로 만들어진 집합을 한 배열에 넣고,
	 * 또다른 난수로 만들어진 집합을 또 다른 배열에 넣은 후,
	 * 그 합집합과 교집합 배열을 계산한다.
	 * @param args
	 */
	public static void main(String[] args) {

		final int ALENGTH = 10;
		final int BLENGTH = 10;
		final int MAX = 20;

		int[] a = new int[ALENGTH];
		int[] b = new int[BLENGTH];

		int[] union = new int[ALENGTH +BLENGTH];
		int unionSize;

		int[] intersection = new int[ALENGTH];
		int intersectionSize;

		ArrayUtil.fillRandomDistinct(a, MAX);
		System.out.print("배열1: ");
		ArrayUtil.printArray(a, a.length);
		if(!ArrayUtil.distinct(a, a.length)) 
			System.out.println("엥? 배열에 중복된 원소가 있네!"); 

		ArrayUtil.fillRandomDistinct(b, MAX);
		System.out.print("배열2: "); 
		ArrayUtil.printArray(b, b. length);
		if(!ArrayUtil.distinct(b, b.length))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

		unionSize = unionArrays(a, b, union);
		System.out. print("Union: ");
		ArrayUtil.printArray (union, unionSize);
		if(!ArrayUtil.distinct(union, unionSize))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

		intersectionSize = intersectionArrays (a, b, intersection);
		System.out.print ("Intersection: ");
		ArrayUtil.printArray(intersection, intersectionSize);
		if(!ArrayUtil.distinct(intersection, intersectionSize))
			System.out. println("엥? 배열에 중복된 원소가 있네!");
	}

}
