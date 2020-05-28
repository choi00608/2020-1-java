package week5;
/**
 * 섭씨 -40도 부터 100까지의 온도를
 * 화씨 온도로 변환 해 주는 프로그램이다.
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
	 * 메인 한수에서 섭씨 온도를 받아 화씨 온도로 변환할 수 있는 수식늘 포함한 함수이다.
	 * 화씨온도값을 반환한다
	 * @param temp
	 * @return
	 */
	public static double convert(int temp) {
		double fn = temp * 9.0/5.0 + 32.0;
		return fn;
	}
}
