package baekjoonAlgorithm;
import java.io.*;
import java.util.*;
public class SmallerThanX_10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sizeAndX = bf.readLine();	//몇개의 정수를 생성할 지 정하는 size와 x보다 작은 수를 고를 때 사용되는 x
		StringTokenizer st = new StringTokenizer(sizeAndX);
		int size = Integer.parseInt(st.nextToken());	//size 정수를 몇 개 생성할지 크기
		int x = Integer.parseInt(st.nextToken());	//x보다 작은 수를 구할 때 사용되는 x
		
		int[] arr = new int[size];	//입력받은 size크기의 배열을 생성
		String num = bf.readLine();	//1이상 size이하의 정수들을 입력 받는다.
		StringTokenizer st2 = new StringTokenizer(num);	//공백을 기준으로 토큰화해서 
		
		for(int i=0; i < size; i++) {	
			arr[i] = Integer.parseInt(st2.nextToken());	//배열에 토큰들을 담아서 관리한다.
			if(arr[i] < x) {	//arr배열의 모든 요소를 x보다 작은지 검사한 후 작으면 출력한다. 
				bw.write(arr[i]+" ");
			}
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
