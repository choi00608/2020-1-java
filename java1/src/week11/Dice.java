package week11;

public class Dice {
	/**
	 * 주사위를 한개 혹은 여러개 굴려서 나온 수를 관찰하여 수의 분포를 확인한다
	 * @param args
	 */
	public static void main(String[] args) {
		final int NUM_DICE = 2;
		final int TRIALS = 10000;

		int[] occurence = new int[6*NUM_DICE+1];


		int temp = 0;
		for (int i = NUM_DICE;i<=TRIALS;i++) {
			temp = castDice(NUM_DICE);
			occurence[temp] = occurence[temp] + 1;

		}

		for (int i = NUM_DICE;i<=occurence.length-1;i++) {
			System.out.println(i+"이(가) 나온 횟수: "+occurence[i]);
		}

	}
	/**
	 * 굴릴 주사위의 개수를 num을 받아서
	 * 주사위를 num번 굴린값을 모두 더한다.
	 * @param num 주사위의 개수
	 * @return 주사위를 굴려나온 값의 합
	 */
	public static int castDice(int num) {
		int temp = 0;
		for (int j = 0;j<num;j++) {
			temp = temp + (int)(6*(Math.random())) + 1;

		}
		return temp;
	}

}
