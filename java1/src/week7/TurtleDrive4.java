package week7;
// sample client for testing

public class TurtleDrive4 {

	public static void main(String[] args) {

		
		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
		Turtle turtle  = new Turtle(0.3, 0.3, 0);	// (x, y, theta)

		for(int i=1; i<=4;i++) {
			drawSquare(turtle);
		}

		turtle.pause(500);
	}
	public static void drawSquare(Turtle t) {
		final double STEP = 0.4;	// �̵� �Ÿ�
		final int ANGLE = 90;		// ȸ�� ����
		final int PAUSE = 500;		// �Ͻ� ���� �ð�. milisecond ����
		
		t.pause(PAUSE);
		t.goForward(STEP);
		t.turnLeft(ANGLE);

	}
}