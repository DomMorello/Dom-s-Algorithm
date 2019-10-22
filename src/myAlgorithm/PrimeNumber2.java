package myAlgorithm;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력값을 받고 이 값 이하의 모든 소수(prime number)를 출력하는 알고리즘임.
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int lineChange = 1; //처음에 자동으로 추가되는 "2 소수" 이것 때문에 처음에는 1로 시작. 5가 되면 개행하고 0으로 초기화할 것임.
		int sum = 1; //소수의 개수를 구하기 위한 변수, 1인 이유는 처음에 "2 소수"가 무조건 포한되기 때문
		
		if(input > 1) {
			System.out.print("2 소수 ");	//input값이 1보다 크면 무조건 2는 소수이므로 그냥 조건없이 출력함.
			for(int i=2; i <= input; i++) {	//입력받은 input보다 작고 2보다 크거나 같은 수로 증가시키면서 소수를 검증함. input보다 작은 값들이 소수인지 판별함.
				for(int j=2; j < i; j++) {	//input보다 작은 수인 i가 소수인지 판단하기 위해 i보다 작고 2보다 크거나 같은 수로 소수인지 검사함
					if(i % j != 0){	//나눠서 딱 떨어지지 않으면 소수임
						if(j == i-1) {	//나누기를 i-1번째 까지 전부 했을 때 i가 소수인지 판별할 수 있음. 하나라도 나머지가 0이 되면 소수가 아님.	
							System.out.print(i+" 소수 ");
							lineChange++;
							sum += 1;	//소수가  나올 떄마다 1을 추가.
							if(lineChange == 5) {
								System.out.println();	//소수라고 출력되는 수가 5번 나오면 줄 바꿈을 함.
								lineChange = 0;	//줄바꿈을 하고 처음부터 5번을 세기 위해 0으로 초기화
							}
						}
					}else {
						break;	//0으로 나누어 떨지는 수가 있으면 그 이후는 할 필요가 없으므로 반복문을 나감.
					}
				}//inner for
			}//outer for
			System.out.println("총 소수의 갯수: " + sum);
		}else {
			System.out.println("2이상의 수를 입력하시오");
			System.exit(0);
		}
	}

}
