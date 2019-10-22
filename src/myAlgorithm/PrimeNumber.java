package myAlgorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(isPrimeNumber(31)) {
			System.out.println("31�� �Ҽ�");
		}else {
			System.out.println("31�� �ռ���");
		}
		
		if(isPrimeNumber(100)) {
			System.out.println("100�� �Ҽ�");
		}else {
			System.out.println("100�� �ռ���");
		}
		
		if(isPrimeNumber(997)) {
			System.out.println("997�� �Ҽ�");
		}else {
			System.out.println("997�� �ռ���");
		}
	}

	//�Ҽ����� �ƴ��� �Ǻ��ϴ� �޼���
	public static boolean isPrimeNumber(int num) {
		int primeCheck = 0;	//�Ҽ����� �ռ������� �Ǻ��ϱ� ���� ����
		
		for(int i=2; i < num; i++) {	//2���� num-1���� ��� ���� �� �����ٰ� �ϳ��� ������ �������� 0�� �Ǹ� �ռ����� �Ǵ�
			if(num % i == 0) {	
				primeCheck++;	//�� ������ �����ϰ� �Ǹ� 1�� num �ڱ��ڽ� �ܿ� ������ �������� 0�� �Ǵ� ����� �ִ� ���̹Ƿ� �ռ����� �Ǻ�
				break;	//i�� 2���� �����ؼ� �ϳ��� ������  �������� 0�� �Ǹ� �� ���Ĵ� �˻��� �ʿ䰡 ������ break�� �ݺ��� �׸���. 
			}
		}
		
		if(primeCheck != 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
