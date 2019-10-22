package baekjoonAlgorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class TheNumberOfNumber_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());
		int input3 = Integer.parseInt(br.readLine());
		
		String multiply = String.valueOf(input1*input2*input3);	//���� ���� ���ڿ��� ������ ��
		int[] arr = new int[multiply.length()];	//���� �迭�� �������� �迭 ����
		
		//���ؼ� ���� ���ڿ��� ������ ��ȯ�Ͽ� �����迭�� ����
		for(int i=0; i < multiply.length(); i++) {
			arr[i] = multiply.charAt(i)-'0';	//char Ÿ���� ��Ҹ� ���������� �ٲ㼭 int�迭�� ����
		}
		
		int[] count = new int[10];	//�� 0~9�� ��� �������� ���� ���� �迭
		
		//�� ��Ұ� 0~9���� ��ġ�ϸ� count�迭�� ��Ҹ� �ϳ��� ������Ű�鼭 ����.
		for(int i=0; i < arr.length; i++) {
			if(arr[i]==0) count[0]++;
			if(arr[i]==1) count[1]++;
			if(arr[i]==2) count[2]++;
			if(arr[i]==3) count[3]++;
			if(arr[i]==4) count[4]++;
			if(arr[i]==5) count[5]++;
			if(arr[i]==6) count[6]++;
			if(arr[i]==7) count[7]++;
			if(arr[i]==8) count[8]++;
			if(arr[i]==9) count[9]++;
		}
		//�� �ٿ� �� ��Ҿ� ���
		for(int i=0; i < count.length; i++) {
			bw.write(count[i]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
