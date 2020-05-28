package week3;

public class ThreeMultiples {
	public static void main(String[]args){


		int sum = 0;
		int i;
		for(i=0;i<101;i=i+3){
			sum = sum + i;
		}
		System.out.println("i를 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");
		System.out.println("1 이상 100이하 3의 배수들의 합= " + sum );

		sum = 0;
		i = 1;
		for(i=0;i<101;i++){
			if(i%3==0){
				sum = sum + i;
			}
		}
		System.out.println("i를 3씩 증가시키면서 i를 더하는 방식으로 계산");
		System.out.println("1 이상 100이하 3의 배수들의 합= " + sum );
	}
}