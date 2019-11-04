package baekjoonAlgorithm;
import java.io.*;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 11. 3.
 */
public class Dial_5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		
		char[][] alphabet = {
				{'A','B','C'},	
				{'D','E','F'},	
				{'G','H','I'},	
				{'J','K','L'},
				{'M','N','O'},
				{'P','Q','R','S'},
				{'T','U','V'},
				{'W','X','Y','Z'}
		};
		int num = 0;
		for(int i=0; i < input.length; i++) {	//char�迭�� �ϳ��� �˻�
			for(int j=0; j < alphabet.length; j++) {	
				for(int k=0; k < alphabet[j].length; k++) {	//ù ����� �˻�
					if(input[i] == alphabet[j][k]){
						num += (j+3);	//alphabet[j][k]���� j�� ���� �� �� ���ڰ� 
						break;			//��ġ�� ��ȣ-2�� �����ִ�. 
										//ex)A�� j=0�� ��ġ�� ������ +2�� ����� �Ѵ�. 
										//�׷��� 2���� ���̾��� ���� �� 3�� �ɸ��� ��ġ��+1�� ����� �Ѵ�.
										//��, +3 �� ����� �������� ���ϴ� �������� ���� �� �ִ�.
					}//if ��
				}//3�� for��
			}//2�� for��
		}//ó�� for��
		bw.write(num+"");
		bw.flush();
		br.close();
	}
}
