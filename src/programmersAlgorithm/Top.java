package programmersAlgorithm;

import java.util.Arrays;

/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 4.
 */
public class Top {
	public static void main(String[] args) {
		
	int[] arr1 = {6,9,5,7,4};	//�Է� �� 1
	int[] arr2 = {3,9,9,3,5,7};	//�Է� ��2
	int[] arr3 = {1,5,3,6,7,6,5};	//�Է� ��2
	
	//return�� ��� �� 1,2,3
	System.out.println(Arrays.toString(solution(arr1)));
	System.out.println(Arrays.toString(solution(arr2)));
	System.out.println(Arrays.toString(solution(arr3)));
	}
	
	public static int[] solution(int[] heights) {
		
        int[] answer = new int[heights.length];	//�Ű������� �Է��� �迭�� ũ�Ⱑ ����, return�� �迭�� ����
        
        answer[0] = 0;	//�� �� �� ��, [0]��°�� �׻� 0��.
        for(int i=1; i < heights.length; i++) {
			for(int j=i-1; j >= 0; j--) {	//�۽��ϴ� ž �ٷ� �� �� ž���� �����ؼ� ���� �� �� ������ ���鼭 ũ�⸦ ����.
				if(heights[j] > heights[i]) {
					answer[i] = j+1;	//�񱳸� �ϴٰ� ���Ϸ��� ž���� ũ�Ⱑ ������ ���ϴ� ž���� ������ �� �� �ִ� ���̹Ƿ�
					break;				//�ε������� return�� answer[] �迭�� ����
				}else {continue;}	//�ٷ� �� �� ž�� ���ߴµ� �ڽ��� �� ũ�ٸ� �ݺ����� ��� ����
			}//end of inner for
		}//end of outer for
        
        return answer;
	}
}
