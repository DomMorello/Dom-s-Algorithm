package baekjoonAlgorithm;
import java.io.*;
import java.util.Arrays;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 21.
 */
public class Max_2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String[] arr = new String[9];	//크기 9짜리 문자열배열 생성
		
		for(int i=0; i < 9; i++) {	//
			String input = br.readLine();
			arr[i] = input;	//9개의 숫자를 엔터를 구분으로 입력을 받아 배열의 각 요소에 차례대로 저장
		}
		
		String[] arrCopy = new String[arr.length];	//새로운 배열을 생성하여 
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);	//원래 배열을 복제한다
		
		int max = Integer.parseInt(arrCopy[0]);
		
		//arrCopy배열을 사용해서 max값을 구한다.
		for(int i=0; i < arrCopy.length; i++) {
			if(max < Integer.parseInt(arrCopy[i]))
				max = Integer.parseInt(arrCopy[i]);
		}
		
		int location = 0;	//위치를 말해주는 location변수를 생성
		//arrCopy에서 최댓값과 원래 배열의 값이 같으면 그 인덱스 +1을 해서 몇 번째에 위치해 있는지를 찾아낸다.
		for(int i=0; i < arr.length; i++) {	
			if(Integer.parseInt(arr[i]) == max) {
				location = i+1;
			}
		}
		
		bw.write(max+"\n");
		bw.write(location+"");
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
