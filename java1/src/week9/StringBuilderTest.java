package week9;
/**
 * ��Ʈ�� ������ ��Ʈ������ ���ڿ��� �߰��ϴ� ���α׷��̴�
 * �� ������� ���ڿ��� �߰��ϰ� �ɸ��� �ð��� ���Ѵ�.
 * @author choi0
 *
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String str = new String("����");

		long startTime;
		long endTime;

		startTime = System.currentTimeMillis();
		for(int j = 0; j <= 10000; j++) {
			str = str + "����";
		}
		endTime = System.currentTimeMillis();

		System.out.println("String ���ϱ� �ð� = "+(endTime-startTime)+"ms");

		startTime=0;
		endTime=0;

		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			builder.append("����");
		}
		endTime = System.currentTimeMillis();

		System.out.println("StringBuilder �ð� = "+(endTime-startTime)+"ms");
	}

}
