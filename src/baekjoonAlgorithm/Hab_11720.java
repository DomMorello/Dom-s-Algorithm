package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class Hab_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();	//�������� ���� � ���� �޴� ��
		String[] num = br.readLine().split("");	// �Է¹޴� ���ڵ��� �� �ڸ��� ������ �迭�� ����
		
		int[] intNum = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();	//String�迭�� int�迭�� ��ȯ
		
		int result = 0;
		for(int i=0; i < intNum.length; i++) {
			result += intNum[i];
		}
		
		System.out.println(result);
	}

}
