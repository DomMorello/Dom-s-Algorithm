package baekjoonAlgorithm;

import java.io.*;
import java.util.Arrays;

public class WordStudy_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "Mississipi";
		char[] chArr = input.toCharArray();	//���ĺ� �迭�� ���ϱ� ���ؼ� char�迭����
		//���ĺ� �迭 ����
		char[] alphabet = new char[26];
		int[] count = new int[26];	//input�� ���Ե� ���ĺ��� ���� ���� �迭
		//���ĺ� �빮�ڷ� �ʱ�ȭ A~Z
		for(int i=0; i < alphabet.length; i++) {
			alphabet[i] = (char)(i+65);
		}
		//input���ڿ��� ���ĺ��� ��� �ݺ��ż� �����ϴ��� �˻�
		for(int i=0; i < chArr.length; i++) {
			for(int j=0; j < alphabet.length; j++) {
				if(chArr[i] == alphabet[j] || chArr[i] == alphabet[j]+32) {
					//�빮�ڶ� ���ų� �ҹ��ڶ� ������ �� ��ġ�� count�� 1���� ��Ų �� �ݺ��� break�Ѵ�.
					count[j]++;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(count));
		Arrays.sort(count);	//count�迭���� �ִ��� ���ϱ� ���� ������� ���� ex){0,0,0,0,0,1,1,4,4}
		System.out.println(Arrays.toString(count));
		
		
	}

}
