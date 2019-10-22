package baekjoonAlgorithm;
import java.io.*;
import java.util.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 22.
 */
public class SelfNumber_4673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> allNum = new ArrayList<>(10000);
		//1���� 10000���� ���� ArrayList�� �ϴ� ����
		for(int i=1; i <= 10000; i++) {
			allNum.add(i);	
		}
		int digitSum;	//�� �ڸ����� ��
		int plus;	//���� ���� �� �ڸ����� ���� ���� ��
		int digit;	//�� �ڸ����� �����ϱ� ���� ����
		int number;	//1~10000������ ��
		
		for(int i=1; i <= 10000; i++) {
			digitSum = 0;	//�� �ݺ����� 0���� �ʱ�ȭ
			plus = 0;	//�� �ݺ����� 0���� �ʱ�ȭ
			number = i;	//�� �ݺ����� i�� �ʱ�ȭ(�ݺ� ����ø��� ���� ���ڸ� �˻��ϱ� ���� i�� �ʱ�ȭ)
			while(number != 0) {	//
				digit = number % 10;	//number�� ������ �ڸ��� ex)1456 --> 6
				digitSum += digit;	//�� �ڸ����� ��� ����
				number /= 10;	//���� �ڸ����� ���ϱ� ���� 10���� ������ ex)1456 --> 145
			}//while ��
			
			plus = i + digitSum;	//ex) 1456 --> plus = 1456 + (1+4+5+6)
			if(allNum.contains(new Integer(plus))) {	//allNum ArrayList�� plus���� ��ġ�ϴ� ���� ������ �̴� �����ڰ� �����Ƿ� �����ѹ��� �ƴ�
				allNum.remove(new Integer(plus));	//�׷��� ����Ʈ���� �� ���� ��������
			}
		}//for ��
		Iterator it = allNum.iterator();
		
		//��� �ݺ����� ������ �����ڰ� �ִ� �����ѹ��� �ƴ� ���ڵ��� ����Ʈ���� �����ϰ� �����ִ� �����ѹ��鸸 ���
		while(it.hasNext()) {
			bw.write(it.next()+"\n");
		}
		bw.flush();
	}
}
