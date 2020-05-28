package week9;
/**
 * 스트링 빌더와 스트링으로 문자열을 추가하는 프로그램이다
 * 두 방식으로 문자열을 추가하고 걸리는 시간을 비교한다.
 * @author choi0
 *
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String str = new String("여름");

		long startTime;
		long endTime;

		startTime = System.currentTimeMillis();
		for(int j = 0; j <= 10000; j++) {
			str = str + "여름";
		}
		endTime = System.currentTimeMillis();

		System.out.println("String 더하기 시간 = "+(endTime-startTime)+"ms");

		startTime=0;
		endTime=0;

		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			builder.append("여름");
		}
		endTime = System.currentTimeMillis();

		System.out.println("StringBuilder 시간 = "+(endTime-startTime)+"ms");
	}

}
