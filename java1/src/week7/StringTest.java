package week7;

public class StringTest {

	public static void main(String[] args) {
		String p ="�����Ѱ� ���� ����";
		String s1,s2,s5;
		int s3;
		char s4;
		System.out.println("���ڿ��� ����(length) = " + p.length());

		s1 = p.concat("�� ���� ������ �� ����.");
		s2 = p.substring(5,7);
		s3 = p.indexOf("�����Ѱ�");
		s4 = p.charAt(3);
		s5 = p.replace("���� ����", "���� �� �ִ�.");

		System.out.println("�ٸ� ���ڿ��� ����� �� ���ڿ�(concat):" + s1);
		System.out.println("5�� ��ġ �̻�, 7����ġ �̸��� �κ� ���ڿ�(substring):" + s2);
		System.out.println("\"�����Ѱ�\"��  " +s3 + "��ġ�� �ֽ��ϴ�.(indexOf)");
		System.out.println("3�� ��ġ�� ����(charAt):" + s4);
		System.out.println("\"�������\"�� \"���� �� �ִ�\" �� ��ü�� �� ���ڿ�(replace):" + s5);
	}

}
