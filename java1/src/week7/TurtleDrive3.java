package week7;
// sample client for testing

public class TurtleDrive3 {

	public static void main(String[] args) {

		final double STEP = 0.2;	// �̵� �Ÿ�
		final int ANGLE = 90;		// ȸ�� ����
		final int PAUSE = 500;		// �Ͻ� ���� �ð�. milisecond ����

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
		Turtle turtle  = new Turtle(0.1, 0.4, 0);	// (x, y, theta)

		for(int j=1; j<=4;j++){
			for(int i=1; i<=4;i++) {
				turtle.pause(PAUSE);
				turtle.goForward(STEP);
				turtle.turnLeft(ANGLE);
			}
			turtle.goForward(0.2);
		}
		turtle.pause(PAUSE);
	}


}