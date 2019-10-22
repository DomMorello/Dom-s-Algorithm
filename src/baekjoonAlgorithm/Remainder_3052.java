package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Remainder_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];	//42�� ���� ���������� ��� ���� �迭
		
		//�Է¹��� ���� 42�� ������ ���� �������� �迭arr�� ����
		for(int i=0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		//Set�� �ߺ��� ������� �ʱ� ������ �ߺ��� ������ �˾Ƽ� ������ �� �ִ�.
		Set set = new HashSet();
		for(int i=0; i < arr.length; i++) {
			set.add(arr[i]);	//�迭�� ��� ��ҵ��� Set�ڷᱸ���� �߰��ϸ� �ߺ��� ������ �˾Ƽ� ���ŵ� �� �����
		}
		
		System.out.println(set.size());	//���� set�� size�� �ҷ����� �ߺ��� ���ŵ� ���� �ٸ� ������������ ������ ���� �� ����.
		br.close();
	}

}
