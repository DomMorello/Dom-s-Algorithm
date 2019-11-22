package myAlgorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AntSequence {
	
	public static String getNextSequence(String previous) {
		//"개수 + 해당숫자"를 쌍으로 저장할 배열의 크기를 먼저 정한다. 
		String result = "";	//return할 결과값
		int repeat = 1;	//반복수
		int size = 1;	//배열의 크기
		if(previous.length() == 1) {	//처음 숫자가 한 자리 숫자면 result에 바로 "1 + 해당숫자"로 반환
			result += repeat + "" + previous;
		}else {	//문자열이 2개 이상이면
			for(int i=1; i < previous.length(); i++) {
				if(previous.charAt(i-1) != previous.charAt(i)) {
					size++;	//같지 않은 숫자가 나오면 배열의 크기를 하나씩 늘려준다. 
				}
			}//for 끝
			String[] pieceArr = new String[size];
			//문자열을 검사해서 "개수 + 해당숫자"를 뽑아내서 배열에 저장한다. 
			int idxArr = 0;	//배열의 인덱스
			String piece = "";	//배열에 넣을 요소 하나
			repeat = 1;	//반복되면 올려줘서 "개수+해당숫자"에서 "개수"에 해당함
			for(int i=1; i < previous.length(); i++) {
				if(previous.charAt(i-1) == previous.charAt(i)) {	//배열의 i번째 요소와 i-1번째 요소가 같으면 repeat을 증가한다
					repeat++;
					if(i == previous.length()-1) {	//i가 마지막 요소이고 전 요소와 같으면 
						piece = repeat + "" + previous.charAt(i-1);	//반복된 수 + 마지막에서 하나 전 요소를 piece 문자열에 담고
						pieceArr[idxArr] = piece;	//piece를 배열에 담는다. idxArr에 ++가 없는 이유는 마지막 배열의 인덱스기 때문에 증감이 필요가 없다.
					}
				}else {
					if(i == previous.length()-1) {	//마지막 요소를 검사할 때 전 요소와 다른숫자면
						piece = repeat + "" + previous.charAt(i-1);	//마지막 숫자가 전 숫자랑 다르다면 그 전 숫자에 해당하는 repeat + 전 요소 를 piece에 저장
						pieceArr[idxArr++] = piece;	//배열에 추가한 후 idxArr을 1 증가시켜줌. 왜냐하면 다음 요소가 또 들어가야 하기 때문에 1증가
						piece = 1 + "" + previous.charAt(i);	//전 요소와 같지 않기 때문에 repeat은 1, 그리고 마지막 요소를 piece에 저장
						pieceArr[idxArr] = piece;	//piece를 배열 마지막 인덱스에 저장
						break;	//아래 코드를 실행하지 않고 반복문을 끝낸다.
					}
					piece = repeat + "" + previous.charAt(i-1);	//마지막 요소를 검사하는 것이 아니고 전 요소와 다른 숫자라면
					pieceArr[idxArr++] = piece;	//(repeat의 초기값인 1 + 검사요소의 전 요소)를 piece에 저장 후 배열에 담는다
					piece = "";	//다음 요소 검사를 위해 piece를 빈 문자열로 초기화
					repeat = 1;	//다음 요소 검사를 위해 repeat을 1로 초기화
				}
			}//for끝
			for(int i=0; i < pieceArr.length; i++) {
				result += pieceArr[i];	//배열의 모든 요소를 result문자열에 합친다.
			}
		}//바깥 else 끝
		return result;	//previous 개미수열의 전 요소를 받아 그 다음 수열인 result를 반환		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());//신기한것. 이 부분을 Integer로 파싱을 하지 않고 br.read()로 받으면 무한루프에 빠진다. 버퍼관련해서 문제가 생기는 것 같다. 
		String start = "1";
		for(int i=0; i < size; i++) {
			bw.write(getNextSequence(start)+"\n");
			start = getNextSequence(start);
		}
		bw.flush();
		br.close();
	}
}
