package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 23.
 */
public class Hansu_1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size1 = br.readLine();
		int size = Integer.parseInt(size1);
		int[] digitArr = new int[size1.length()];
		int[] num = new int[size];
		int[] gap = new int[size1.length()-1];
		int digit;
		int count=0;
		
		//1���� �Է¹޴� ������ �迭�� ������ �ʱ�ȭ ex) 1,2,3,4,...,89,99,100,...,1000
		for(int i=0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		if(size < 100) {	//100�̸��� ���� ���� �� �Ѽ�
			count = size;
			System.out.println(count);
		}else if(size >= 100 && size < 1000){
			
			for(int i=99; i < num.length; i++) {
				
				//�� ����� �ڸ����� ������ �迭�� ����(���Ŀ� �� �ڸ����� ���������� �̷���� �˻��ϱ� ���� ���� )
				int j = 0;
				while(num[i] != 0) {
					digit = num[i] % 10;
					digitArr[j] = digit;	
					j++;
					num[i] /= 10;
					
				}//while ��
				//�� �ڸ����� ���� gap�迭�� ����
				for(int k=0; k < gap.length; k++) {
					gap[k] = digitArr[k]-digitArr[k+1];
				}
				
				//�� �ڸ������� ���� ���ϰ� �� ���� ���� ������ count�� 1������Ŵ
				int check=0;
				for(int l=0; l < gap.length; l++) {
					if(gap[0] == gap[l]) {
						check++;
					}
				}
				if(check == gap.length) {
					count++;
				}
			}//outer for ��
			System.out.println(count+99);	//99�� 1~99���� ��� �Ѽ��̱� ������ ������
			
		}else {	//1000�� �Է¹����� �� ���� outofindexException�߻��ؼ� ���� ó��
			count = 144;
			System.out.println(count);
		}
	}
}
