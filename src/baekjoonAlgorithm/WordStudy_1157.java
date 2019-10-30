package baekjoonAlgorithm;

import java.io.*;
import java.util.Arrays;

public class WordStudy_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "Mississipi";
		char[] chArr = input.toCharArray();	//알파벳 배열과 비교하기 위해서 char배열생성
		//알파벳 배열 생성
		char[] alphabet = new char[26];
		int[] count = new int[26];	//input에 포함된 알파벳을 세기 위한 배열
		//알파벳 대문자로 초기화 A~Z
		for(int i=0; i < alphabet.length; i++) {
			alphabet[i] = (char)(i+65);
		}
		//input문자열의 알파벳이 몇번 반복돼서 등장하는지 검사
		for(int i=0; i < chArr.length; i++) {
			for(int j=0; j < alphabet.length; j++) {
				if(chArr[i] == alphabet[j] || chArr[i] == alphabet[j]+32) {
					//대문자랑 같거나 소문자랑 같으면 그 위치의 count를 1증가 시킨 후 반복을 break한다.
					count[j]++;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(count));
		Arrays.sort(count);	//count배열에서 최댓값을 구하기 위해 순서대로 정렬 ex){0,0,0,0,0,1,1,4,4}
		System.out.println(Arrays.toString(count));
		
		
	}

}
