package myAlgorithm;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Է°��� �ް� �� �� ������ ��� �Ҽ�(prime number)�� ����ϴ� �˰�����.
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int lineChange = 1; //ó���� �ڵ����� �߰��Ǵ� "2 �Ҽ�" �̰� ������ ó������ 1�� ����. 5�� �Ǹ� �����ϰ� 0���� �ʱ�ȭ�� ����.
		int sum = 1; //�Ҽ��� ������ ���ϱ� ���� ����, 1�� ������ ó���� "2 �Ҽ�"�� ������ ���ѵǱ� ����
		
		if(input > 1) {
			System.out.print("2 �Ҽ� ");	//input���� 1���� ũ�� ������ 2�� �Ҽ��̹Ƿ� �׳� ���Ǿ��� �����.
			for(int i=2; i <= input; i++) {	//�Է¹��� input���� �۰� 2���� ũ�ų� ���� ���� ������Ű�鼭 �Ҽ��� ������. input���� ���� ������ �Ҽ����� �Ǻ���.
				for(int j=2; j < i; j++) {	//input���� ���� ���� i�� �Ҽ����� �Ǵ��ϱ� ���� i���� �۰� 2���� ũ�ų� ���� ���� �Ҽ����� �˻���
					if(i % j != 0){	//������ �� �������� ������ �Ҽ���
						if(j == i-1) {	//�����⸦ i-1��° ���� ���� ���� �� i�� �Ҽ����� �Ǻ��� �� ����. �ϳ��� �������� 0�� �Ǹ� �Ҽ��� �ƴ�.	
							System.out.print(i+" �Ҽ� ");
							lineChange++;
							sum += 1;	//�Ҽ���  ���� ������ 1�� �߰�.
							if(lineChange == 5) {
								System.out.println();	//�Ҽ���� ��µǴ� ���� 5�� ������ �� �ٲ��� ��.
								lineChange = 0;	//�ٹٲ��� �ϰ� ó������ 5���� ���� ���� 0���� �ʱ�ȭ
							}
						}
					}else {
						break;	//0���� ������ ������ ���� ������ �� ���Ĵ� �� �ʿ䰡 �����Ƿ� �ݺ����� ����.
					}
				}//inner for
			}//outer for
			System.out.println("�� �Ҽ��� ����: " + sum);
		}else {
			System.out.println("2�̻��� ���� �Է��Ͻÿ�");
			System.exit(0);
		}
	}

}
