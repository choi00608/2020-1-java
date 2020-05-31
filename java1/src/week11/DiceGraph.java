package week11;

public class DiceGraph {
	/**
	 * �ֻ����� �Ѱ� Ȥ�� ������ ������ ���� ���� �����Ͽ� ���� ������ Ȯ���Ѵ�
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
			System.out.println(i+"��(��) ���� Ƚ��: "+occurence[i]);
		}

		System.out.println(" ");
		graph(occurence, height, NUM_DICE);


	}
	/**
	 * �ֻ����� �Ѱ� Ȥ�� ������ ������ ���� ����������, 
	 * ���� ������ ������ �� �� �ְ� ���� ���� ���� �迭�� �����Ѵ�.
	 * �� �迭�� �޾� �ֻ����� �������� ������ ���� ������ ��Ÿ���� �׷����� �����.
	 * @param occurence �ֻ��� ���� ����
	 * @param num �ֻ����� ����
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
	 * �迭�� �ִ� ���� ��50���� �ǵ��� �� 1���� ���� �����Ѵ�.
	 * ���� �� 1���� �ǹ��ϴ� ���� ���� ���� ������ �����ϸ鼭 �׷����� ����Ѵ�.
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