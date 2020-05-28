package week7;
// sample client for testing

public class TurtleDrive4 {

	public static void main(String[] args) {

		
		// 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
		// (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
		// 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
		// 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.
		Turtle turtle  = new Turtle(0.3, 0.3, 0);	// (x, y, theta)

		for(int i=1; i<=4;i++) {
			drawSquare(turtle);
		}

		turtle.pause(500);
	}
	public static void drawSquare(Turtle t) {
		final double STEP = 0.4;	// 이동 거리
		final int ANGLE = 90;		// 회전 각도
		final int PAUSE = 500;		// 일시 정지 시간. milisecond 단위
		
		t.pause(PAUSE);
		t.goForward(STEP);
		t.turnLeft(ANGLE);

	}
}