package week5;
/**
 * ���� -40�� ���� 100������ �µ���
 * ȭ�� �µ��� ��ȯ �� �ִ� ���α׷��̴�.
 * @author choi0
 *
 */
public class CelciusToFarenheit {

	public static void main(String[] args) {
		int celcious = -40;

		for(celcious = -40;celcious<=100;celcious++) {

			convertCelciousToFarenheit(celcious);

		}

	}
	public static void convertCelciousToFarenheit(int temp) {
		double fn = temp * 9.0/5.0 + 32.0;
		System.out.println("C = "+ temp +"--> F = " +fn);
	}
}
