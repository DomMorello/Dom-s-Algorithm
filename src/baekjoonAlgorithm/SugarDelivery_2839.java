package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 24.
 */
public class SugarDelivery_2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		
		int result = -1;	//�Ʒ� �ڵ忡 ��� �ش����� ������ -1 �� ���
		int tmp = 0;	//5�� �ϳ��� ���鼭 ����ϱ� ���� �ӽð���
		//�ϴ� 5�� �������� 5�� ���� ���� �ִ�ȿ��
		if(input%5 == 0) {
			result = input/5;
		//5�� ���� �������� 3�̸� 5�� �� ������ ������ 3�� �� ������ ó���ϸ� ��
		}else if((input%5)%3 == 0){
			result = input/5 + (input%5)/3;
		//�� �ܿ� ��쿡��
		}else if((input%5)%3 != 0) {	
			for(int i=0; i < input/5; i++) {	//�״�� �ִ� ���º��� ����� �ϴµ� 5�� �ϳ��� ���鼭 ���
				tmp = input - 5*i;
				if(tmp == 12) {	//5�� i�� ���� 12�� ������ �Ʒ��� ���� �ذ��ϸ� �ִ�ȿ��
					result = i + 4;
					break;
				}else if(tmp == 9) {	//5�� i�� ���� 9�� ������ �Ʒ��� ���� �ذ��ϸ� �ִ�ȿ��
					result = i + 3;
					break;
				}else if(tmp == 6) {	//5�� i�� ���� 6�� ������ �Ʒ��� ���� �ذ��ϸ� �ִ�ȿ��
					result = i + 2;
					break;
				}
			}//for ��
		}
		bw.write(result+"");
		bw.flush();
		br.close();
	}
}
