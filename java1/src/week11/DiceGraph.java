package week11;

public class DiceGraph {
	/**
	 * 주사위를 한개 혹은 여러개 굴려서 나온 수를 관찰하여 수의 분포를 확인한다
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUM_DICE = 5;
		final int TRIALS = 10000;

		int height = 50;

		int[] occurence = new int[6*NUM_DICE+1];


		int temp = 0;
		for (int i = NUM_DICE;i<=TRIALS;i++) {
			temp = Dice.castDice(NUM_DICE);
			occurence[temp] = occurence[temp] + 1;

		}

		for (int i = NUM_DICE;i<=occurence.length-1;i++) {
			System.out.println(i+"이(가) 나온 횟수: "+occurence[i]);
		}

		System.out.println(" ");
		graph(occurence, height, NUM_DICE);


	}
	/**
	 * 주사위를 한개 혹은 여러개 굴려서 나온 값들을더해, 
	 * 더한 값들의 분포를 알 수 있게 나온 수에 따라 배열에 저장한다.
	 * 그 배열을 받아 주사위를 굴려나온 값들을 별의 개수로 나타내어 그래프를 만든다.
	 * @param occurence 주사위 합의 분포
	 * @param num 주사위의 개수
	 */
	public static void graph(int [] occurence, int num) {
		for (int i = num;i<=occurence.length-1;i++) {
			System.out.print(i+":"+occurence[i]+"\t\t");

			for (int j = 1;j<=occurence[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/**
	 * 배열의 최대 값이 별50개가 되도록 별 1개의 값을 조정한다.
	 * 그후 별 1개가 의미하는 값에 따라 별의 개수를 조정하면서 그래프를 출력한다.
	 * @param a
	 * @param height
	 * @param from
	 */
	public static void graph(int[] a, int height, int from) {

		int n = a.length;

		int[] temp = a.clone();

		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n ; j++) { 
				if (temp[i] >temp[j]) {
					int imsi = temp[i];
					temp[i] = temp[j];
					temp[j] = imsi;
				}
			}
		}

		int rate = Math.round(temp[a.length-1]/height);

		for (int i = from;i<=a.length-1;i++) {
			System.out.print(i+":"+a[i]+"\t\t");

			for (int j = 1;j<=a[i]/rate;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}