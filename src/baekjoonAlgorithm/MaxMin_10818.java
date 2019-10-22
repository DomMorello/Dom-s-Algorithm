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
		
		String[] elements = br.readLine().split(" ");	//공백으로 구분하여 elements배열에 담아서
		//배열의 각 요소에 입력받은 값을 저장
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);	//arr 정수배열에 elements 요소들을 대입
		}
		
		int max = arr[0];	//배열의 첫번째 인덱스에 위치한 요소를 max에 저장
		int min = arr[0];	//배열의 첫번쨰 인덱스에 위치한 요소를 min에 저장
		
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];	//배열 안의 모든 요소를 검사하여 가장 큰 값을 max에 저장
			}
			if(min > arr[i]) {
				min = arr[i];	//배열 안의 모든 요소를 검사하여 가장 작은 값을 min에 저장
			}
		}
		
		bw.write(min+" "+max+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
