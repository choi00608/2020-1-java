package week5;
/**
 * ���� -40�� ���� 100������ �µ���
 * ȭ�� �µ��� ��ȯ �� �ִ� ���α׷��̴�.
 * @author choi0
 *
 */
public class CelciusToFarenheit2 {

	public static void main(String[] args) {
		int celcious = -40;
		double fn;
		for(celcious = -40;celcious<=100;celcious++) {
			fn = convert(celcious);
			System.out.println("C = "+ celcious +"--> F = " +fn);

		}

	}
	/**
	 * ���� �Ѽ����� ���� �µ��� �޾� ȭ�� �µ��� ��ȯ�� �� �ִ� ���Ĵ� ������ �Լ��̴�.
	 * ȭ���µ����� ��ȯ�Ѵ�
	 * @param temp
	 * @return
	 */
	public static double convert(int temp) {
		double fn = temp * 9.0/5.0 + 32.0;
		return fn;
	}
}
