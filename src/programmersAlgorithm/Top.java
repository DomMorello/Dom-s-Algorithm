package programmersAlgorithm;

import java.util.Arrays;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 4.
 */
public class Top {
	public static void main(String[] args) {
		
	int[] arr1 = {6,9,5,7,4};	//입력 예 1
	int[] arr2 = {3,9,9,3,5,7};	//입력 예2
	int[] arr3 = {1,5,3,6,7,6,5};	//입력 예2
	
	//return값 출력 예 1,2,3
	System.out.println(Arrays.toString(solution(arr1)));
	System.out.println(Arrays.toString(solution(arr2)));
	System.out.println(Arrays.toString(solution(arr3)));
	}
	
	public static int[] solution(int[] heights) {
		
        int[] answer = new int[heights.length];	//매개변수로 입력할 배열과 크기가 같은, return할 배열을 생성
        
        answer[0] = 0;	//맨 왼 쪽 즉, [0]번째는 항상 0임.
        for(int i=1; i < heights.length; i++) {
			for(int j=i-1; j >= 0; j--) {	//송신하는 탑 바로 왼 쪽 탑부터 시작해서 가장 왼 쪽 끝까지 가면서 크기를 비교함.
				if(heights[j] > heights[i]) {
					answer[i] = j+1;	//비교를 하다가 비교하려는 탑보다 크기가 작으면 비교하는 탑에서 수신을 할 수 있는 것이므로
					break;				//인덱스값을 return할 answer[] 배열에 대입
				}else {continue;}	//바로 왼 쪽 탑과 비교했는데 자신이 더 크다면 반복문을 계속 진행
			}//end of inner for
		}//end of outer for
        
        return answer;
	}
}
