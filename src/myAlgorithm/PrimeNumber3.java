package myAlgorithm;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 30.
 */
public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=========================");
		System.out.println("�̷�ũ���� �Ҽ� �Ǵ� ���α׷�");
		System.out.println("\t\t-�̵���");
		System.out.println("=========================\n\n");
		int[] ranNumArr = new int[100];	//������ ������ �迭 ����(ũ�Ⱑ 100�� ������ �ִ��� ū ������ ������ ����)
		int count=0;	//�Ҽ��� �迭�� index0���� ���ʴ�� �����ϱ� ���� ���� �� �Ҽ��� ���� ���� ����
		
		
		for(int i=0; i < ranNumArr.length; i++) {
			int ranNum = (int)(Math.random()*1000)+1;	//1~1000���� ���� ����
			if(isPrimeNumber(ranNum)) {	//�Ҽ� �˻�
				System.out.println("�Ҽ��߰�: " + ranNum);
				ranNumArr[count++] = ranNum;	//ranNumArr�迭�� ù��°���� �Ҽ��� ����
			}
		}
		System.out.println("\n-----------------------");
		System.out.println("�������:");
		System.out.printf("    �Ҽ� ����: %d\n",count);
		System.out.printf("    �ּ� �Ҽ�: %d\n",minPrime(ranNumArr, count));
		System.out.printf("    �ִ� �Ҽ�: %d\n",maxPrime(ranNumArr, count));
		System.out.println("=========================");
		
		
	}
	//�Ű������� �޴� ������ �Ҽ����� �ƴ��� �˻��ϴ� �޼���
	public static boolean isPrimeNumber(int num) {
		int primeCheck = 0;	//�Ҽ����� �ռ������� �Ǻ��ϱ� ���� ����
		if(num == 1) {	//1�� ������ �Ҽ��� �ƴ�
			return false;
		}
		if(num == 2) {	//2�� ������ �Ҽ���
			return true;
		}else {	//1�� 2�� ������ ��� ���ڸ� �˻���
			for(int i=2; i < num; i++) {	
				if(num % i == 0) {	//2���� num-1���� ��� ���� �� �����ٰ� �ϳ��� ������ �������� 0�� �Ǹ� �ռ����� �Ǵ�
					primeCheck++;	//�� ������ �����ϰ� �Ǹ� 1�� num �ڱ��ڽ� �ܿ� ������ �������� 0�� �Ǵ� ����� �ִ� ���̹Ƿ� �ռ����� �Ǻ�
					break;	//i�� 2���� �����ؼ� �ϳ��� ������  �������� 0�� �Ǹ� �� ���Ĵ� �˻��� �ʿ䰡 ������ break�� �ݺ��� �׸���. 
				}
			}
			if(primeCheck != 0) {	
				return false;	//primeCheck�� �������� �ռ���
			}else {
				return true;	//�״�� 0�̸� �Ҽ�
			}
		}
	}
	
	//�Ű������� �޴� �迭���� �ּڰ��� ���ϴ� �޼���
	public static int minPrime(int[] arr, int count) {	//int count�� �޴� ������ ���� ���ʿ� ������ �迭�� ũ�Ⱑ 100�ε�
														//�Ҽ��� �ٽ� 0���� ���� �ְ� ���� �κ��� �� 0���� �ʱ�ȭ ���ֱ� ������
														//�ּڰ��� 0���� ����. �̸� �����ϱ� ���� count�� ������ �ް� �� �κб����� �˻���
		int min = arr[0];
		for(int i=0; i < count; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	//�Ű������� �޴� �迭���� �ִ��� ���ϴ� �޼���
	public static int maxPrime(int[] arr, int count) {	
		int max = arr[0];
		for(int i=0; i < count; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
