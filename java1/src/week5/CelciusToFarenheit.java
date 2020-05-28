package week5;
/**
 * 섭씨 -40도 부터 100까지의 온도를
 * 화씨 온도로 변환 해 주는 프로그램이다.
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
