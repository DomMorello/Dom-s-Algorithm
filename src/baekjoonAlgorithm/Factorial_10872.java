package baekjoonAlgorithm;
import java.io.*;
public class Factorial_10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(input));
	}
	
	public static int factorial(int num) {
		int result=1;	//1은 곱해도 result에 변화가 없기 때문에 1로 초기화
		if(num > 0) {	//num-1을 재귀함수를 통해 계속 하는데 0보다 클 때 까지만 해야하기 때문에 조건을 달아줌
			result = num*factorial(num-1);	//f(n) = n x f(n-1)
		}
		return result;
	}
}
