package baekjoonAlgorithm;
import java.io.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Scale_2920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int[] arr = new int[input.length];
		
		//String�迭�� �ִ� ��ҵ��� int�� ĳ������ �� int�迭�� ������.
		for(int i=0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		String answer = "";	//����� ���� ����� ���� ����
		
		//�迭�� �ٷ� ���� ���� �� ������ 1�� ���� ���� �´ٸ� ��������, 1�� �� ���� ������ ��������
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i+1] == arr[i]+1) {
				answer = "ascending";
			}else if(arr[i+1] == arr[i]-1) {
				answer = "descending";
			}else {	//�� �� ���� ��Ȳ�� �ϳ��� �ƴϸ� mixed�� �����ϰ� �ٷ� break;
				answer = "mixed";
				break;
			}
		}
		bw.write(answer);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
