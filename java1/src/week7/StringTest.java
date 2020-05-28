package week7;

public class StringTest {

	public static void main(String[] args) {
		String p ="영원한건 절대 없다";
		String s1,s2,s5;
		int s3;
		char s4;
		System.out.println("문자열의 길이(length) = " + p.length());

		s1 = p.concat("는 말도 영원할 수 없다.");
		s2 = p.substring(5,7);
		s3 = p.indexOf("영원한건");
		s4 = p.charAt(3);
		s5 = p.replace("절대 없다", "있을 수 있다.");

		System.out.println("다른 문자열이 연결된 새 문자열(concat):" + s1);
		System.out.println("5번 위치 이상, 7번위치 미만의 부분 문자열(substring):" + s2);
		System.out.println("\"영원한건\"은  " +s3 + "위치에 있습니다.(indexOf)");
		System.out.println("3번 위치의 글자(charAt):" + s4);
		System.out.println("\"절대없다\"를 \"있을 수 있다\" 로 교체한 새 문자열(replace):" + s5);
	}

}
