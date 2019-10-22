package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Max_2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String[] arr = new String[9];	//ũ�� 9¥�� ���ڿ��迭 ����
		
		for(int i=0; i < 9; i++) {	//
			String input = br.readLine();
			arr[i] = input;	//9���� ���ڸ� ���͸� �������� �Է��� �޾� �迭�� �� ��ҿ� ���ʴ�� ����
		}
		
		String[] arrCopy = new String[arr.length];	//���ο� �迭�� �����Ͽ� 
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);	//���� �迭�� �����Ѵ�
		
		int max = Integer.parseInt(arrCopy[0]);
		
		//arrCopy�迭�� ����ؼ� max���� ���Ѵ�.
		for(int i=0; i < arrCopy.length; i++) {
			if(max < Integer.parseInt(arrCopy[i]))
				max = Integer.parseInt(arrCopy[i]);
		}
		
		int location = 0;	//��ġ�� �����ִ� location������ ����
		//arrCopy���� �ִ񰪰� ���� �迭�� ���� ������ �� �ε��� +1�� �ؼ� �� ��°�� ��ġ�� �ִ����� ã�Ƴ���.
		for(int i=0; i < arr.length; i++) {	
			if(Integer.parseInt(arr[i]) == max) {
				location = i+1;
			}
		}
		
		bw.write(max+"\n");
		bw.write(location+"");
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
