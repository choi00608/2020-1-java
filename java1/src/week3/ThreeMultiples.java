package week3;

public class ThreeMultiples {
	public static void main(String[]args){


		int sum = 0;
		int i;
		for(i=0;i<101;i=i+3){
			sum = sum + i;
		}
		System.out.println("i�� 1�� ������Ű�鼭 i�� 3�� ����� ���� ���ϴ� ������� ���");
		System.out.println("1 �̻� 100���� 3�� ������� ��= " + sum );

		sum = 0;
		i = 1;
		for(i=0;i<101;i++){
			if(i%3==0){
				sum = sum + i;
			}
		}
		System.out.println("i�� 3�� ������Ű�鼭 i�� ���ϴ� ������� ���");
		System.out.println("1 �̻� 100���� 3�� ������� ��= " + sum );
	}
}