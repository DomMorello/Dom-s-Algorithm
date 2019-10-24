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
		int result=1;	//1�� ���ص� result�� ��ȭ�� ���� ������ 1�� �ʱ�ȭ
		if(num > 0) {	//num-1�� ����Լ��� ���� ��� �ϴµ� 0���� Ŭ �� ������ �ؾ��ϱ� ������ ������ �޾���
			result = num*factorial(num-1);	//f(n) = n x f(n-1)
		}
		return result;
	}
}
