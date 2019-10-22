package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class MaxMin_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		
		String[] elements = br.readLine().split(" ");	//�������� �����Ͽ� elements�迭�� ��Ƽ�
		//�迭�� �� ��ҿ� �Է¹��� ���� ����
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);	//arr �����迭�� elements ��ҵ��� ����
		}
		
		int max = arr[0];	//�迭�� ù��° �ε����� ��ġ�� ��Ҹ� max�� ����
		int min = arr[0];	//�迭�� ù���� �ε����� ��ġ�� ��Ҹ� min�� ����
		
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];	//�迭 ���� ��� ��Ҹ� �˻��Ͽ� ���� ū ���� max�� ����
			}
			if(min > arr[i]) {
				min = arr[i];	//�迭 ���� ��� ��Ҹ� �˻��Ͽ� ���� ���� ���� min�� ����
			}
		}
		
		bw.write(min+" "+max+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
