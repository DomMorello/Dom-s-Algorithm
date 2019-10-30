package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 22.
 */
public class OverAverage_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int sum;
		float average;
		int students;	//����� �Ѵ� �л���
		
		//�׽�Ʈ case��ŭ�� �ݺ��� ����
		for(int i=0; i < size; i++) {
			sum = 0;
			average = 0.0f;
			students = 0;	//�� �������� ���̽����� �� �ٸ� ���� ����ž� �ϱ� ������ �� �ݺ����� 0���� �ʱ�ȭ��
			
			String[] input = br.readLine().split(" ");	//������ �������� �Է°��� ���ڿ��迭�� ����
			//String�迭�� int�迭�� ��ȯ
			int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
			
			for(int j=1; j <= arr[0]; j++) {
				sum += arr[j];	//����� ���ϱ� ���ؼ� ���� ����
			}
			average = (float)sum/arr[0];	//����� ���� ��
			
			for(int k=1; k <= arr[0]; k++) {
				if(arr[k] > average)	//��պ��� ���� �л��� ���� ���ϰ�
					students++;
			}
			System.out.printf("%.3f%%\n", (float)students/arr[0]*100);	//�� �л����� ������ ����Ѵ�.
		}//outer for ��
	}
}
