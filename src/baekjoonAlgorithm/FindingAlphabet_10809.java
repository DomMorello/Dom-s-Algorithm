package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 29.
 */
public class FindingAlphabet_10809 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); //string�迭�� ��ȯ
		char[] inputArr = input.toCharArray(); //�Է� ���� ���� char[]�� ��ȯ
		
		int[] alphabet = new int[26];
		//���ĺ� ���� �迭�� a~z���� char�� �ش��ϴ� ������ ����
		for(int i=0; i < alphabet.length; i++) {
			alphabet[i] = i+97;
		}
		
		int[] check = new int[26];	//�迭�� ��ȭ�� ���� �κ��� -1�� �ٲٱ� ���� �˻��ϴ� �迭
		
		for(int i=0; i < inputArr.length; i++) {
			for(int j=0; j < alphabet.length; j++) {
				if((int)inputArr[i] == alphabet[j]) {	//inputArr�� i��° ��Ұ� ���ĺ��迭�� j��° ��ҿ� ���ٸ�
					alphabet[j] = i;	//i�� �� ��ġ�� �ǹ��ϹǷ� ���ĺ� �迭�� �� ��ġ�� ��Ÿ������ ����
					check[j] = 1;	//���ĺ� �迭�� ũ�Ⱑ ���� �迭�� �����ϰ� �⺻���� ���� 0���� ����������� ��ȭ�� ������ 1�� ������
					break;
				}
			} 
		}
		//��ȭ�� ���� �κ��� -1�� �ٲ۴�.
		for(int i=0; i < check.length; i++) {
			if(check[i] == 0) {	//��ȭ�� �ִ� �κ��� 1�� ���������� ��ȭ�� ����, ��, 0���� �����ִ� ��ҵ��� ��ġ�� �ִ� ���ĺ� �迭�� -1�� �ٲ۴�
				alphabet[i] = -1;
			}
		}
		//���� ���
		for(int i=0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
	}
}
