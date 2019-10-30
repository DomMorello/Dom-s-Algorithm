package baekjoonAlgorithm;

import java.io.*;
import java.util.Arrays;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 30.
 */
public class WordStudy_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
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
		//count배열에서 최댓값을 일단 구해보자
		int max = count[0];	
		for(int i=0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		//max값과 일치하는 위치의 char를 뽑아라
		int location = 0;
		int repeat = 0;	//그런데 최댓값이 반복이 되면 ?를 출력하기 위해서 선언
		for(int i=0; i < alphabet.length; i++) {
			if(max == count[i]) {
				repeat++;	//최댓값이 2개 이상이면 repeat을 증가시킨다.
				location = i;	//최댓값의 위치를 얻는다.
			}
		}
		if(repeat > 1) {
			System.out.println('?');	//최댓값이 2개 이상이면 ? 를 출력
		}else {
			System.out.println(alphabet[location]);	//최댓값이 1개면 location위치에 있는 문자를 출력
		}
	}
}
