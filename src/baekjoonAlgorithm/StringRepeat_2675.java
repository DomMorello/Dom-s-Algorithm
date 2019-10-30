package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 29.
 */
public class StringRepeat_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());	//�׽�Ʈ���̽��� �� �� �������� ���ϴ� ���� �Է¹���
		
		for(int k=0; k < times; k++) {	//�׽�Ʈȸ����ŭ �Է¹޾Ƽ� �����Ѵ�.
			String[] inputArr = br.readLine().split(" "); //�Է°��� ���⸦ �������� �� ���� �迭��ҷ� ����
			for(int i=0; i < inputArr[1].length(); i++) {	//[1]��Ұ� �ݺ��� ���ڿ��̹Ƿ� �� ���̸�ŭ �ݺ�
				for(int j=0; j < Integer.parseInt(inputArr[0]); j++) {	//[0]��Ұ� ���ڿ��� ���ڸ� �� �� ������� ����
					System.out.print(inputArr[1].charAt(i));	//���ڿ��� ó������ ������ �� ���ھ� �ݺ� �����
				}//���� �� for ��
			}//�߰� for ��
			System.out.println();
		}//�ٱ� for ��
		
		br.close();
	}
}
