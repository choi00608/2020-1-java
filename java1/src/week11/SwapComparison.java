package week11;

public class SwapComparison {
	/**
	 * swap 의 두가지 방법을 테스트한다
	 * @param args
	 */
	public static void main(String[] args) {

		int[] anArray = {10,20};
		/**
		 * 1. anArray[0],anArray[1]의 값을 각각 x,y로 보낸다.
		 * 2. swap 에서 받은 값 x,y 에서, temp 변수를 만들어 x값을 임시로 저장한다.
		 * 3. x에 y값을 넣고,
		 * 4. y에 temp값을 넣는다.
		 */
		swap(anArray[0], anArray[1]);
		System.out.println("anArray[0]="+anArray[0]+", anArray[1]="+anArray[1]);
		/**
		 * 1. anArray와 리스트에서 바꾸고 싶은 값의 순서값을 보낸다
		 * 2. 바꾸고 싶은 순서값을 각각 i 와 j 에 저장한다
		 * 3. 변수 temp를 만들어, anArray[i]값을 저장한다.
		 * 4. anArray[j] 값에 anArray[i]을 저장한다.
		 * 
		 */
		swap(anArray, 0, 1);
		System.out.println("anArray[0]="+anArray[0]+", anArray[1]="+anArray[1]);

	}
	/**
	 * x,y의 값을 서로 바꿔준다.
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	/**
	 * 배열의 두 원소 값을 서로 바꿔준다.
	 * a[i]<--->a[j]
	 * @param a 배열
	 * @param i 값을 바꿀 방 번호
	 * @param j 값을 바꿀 방 번호
	 */
	public static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
