package week3;

import week11.ArrayUtil;

public class UnionIntersection {

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
