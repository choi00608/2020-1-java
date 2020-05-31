package week11;

public class Dice {
	/**
	 * �ֻ����� �Ѱ� Ȥ�� ������ ������ ���� ���� �����Ͽ� ���� ������ Ȯ���Ѵ�
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
			System.out.println(i+"��(��) ���� Ƚ��: "+occurence[i]);
		}

	}
	/**
	 * ���� �ֻ����� ������ num�� �޾Ƽ�
	 * �ֻ����� num�� �������� ��� ���Ѵ�.
	 * @param num �ֻ����� ����
	 * @return �ֻ����� �������� ���� ��
	 */
	public static int castDice(int num) {
		int temp = 0;
		for (int j = 0;j<num;j++) {
			temp = temp + (int)(6*(Math.random())) + 1;

		}
		return temp;
	}

}
