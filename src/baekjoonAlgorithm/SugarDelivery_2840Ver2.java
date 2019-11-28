package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 24.
 */
public class SugarDelivery_2840Ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());	//�� ����ؾ� �ϴ� ������
		br.close();
		
		int result = 0;	//�ڽ�����
		while(true) {
			if(input % 5 == 0) {
				result += input/5;	//5�� �������� �׳� 5�� ���� �ڽ������� ���� ȿ����, 3�� ���ٰ� 5�� �������� �ڽ��� 5�� ���� ���� �߰�
				break;
			}
			input -= 3;	//�ݺ��ϸ鼭 �Է°�(����ؾ��� ������)���� 3kg�� ���� 
			result += 1;	//3Ű�θ� ������ 1���� box�� �߰��Ѵ�.
			if(input < 0) {
				result = -1;	//���� �̷������� ������ �ݺ��ߴµ� �� ������ �������� �ʰ� 0���� �۾����� ����� �� ���� ���� �ȴ�.
				break;
			}
		}
		
		bw.write(result+"");
		bw.flush();
	}
}
