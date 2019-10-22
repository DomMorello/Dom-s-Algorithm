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
		int[] arr = new int[10];	//42로 나눈 나머지들을 담기 위한 배열
		
		//입력받은 값을 42로 나눠서 나온 나머지를 배열arr에 저장
		for(int i=0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		//Set은 중복을 허용하지 않기 떄문에 중복된 값들을 알아서 제거할 수 있다.
		Set set = new HashSet();
		for(int i=0; i < arr.length; i++) {
			set.add(arr[i]);	//배열의 모든 요소들을 Set자료구조에 추가하면 중복된 값들이 알아서 제거된 후 저장됨
		}
		
		System.out.println(set.size());	//이후 set의 size를 불러내면 중복이 제거된 서로 다른 나머지값들의 개수를 구할 수 있음.
		br.close();
	}

}
