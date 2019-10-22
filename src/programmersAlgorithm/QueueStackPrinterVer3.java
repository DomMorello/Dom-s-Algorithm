package programmersAlgorithm;
import java.util.*;
public class QueueStackPrinterVer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �ٸ� ���� �ڵ带 ������.
		 * ��ó: https://github.com/os94/Algorithm-Study/blob/master/ohsang/Programmers/Stack%2CQueue/Printer_v2.java
		 * */
		
        int[] priorities1 = {2,1,3,2};
        System.out.println(solution(priorities1, 2));
        int[] priorities2 = {1,1,9,1,1,1};
        System.out.println(solution(priorities2, 0));
        
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int data : priorities)	//priorities�� ������ִ� ������ �״�� queue�� ����
			queue.add(data);
		
		Arrays.sort(priorities);	//{1,2,2,3}���� ���ĵ�
		
		while(!queue.isEmpty()) {
			Integer data = queue.poll();	//queue���� ���� �� ��ü�� ���� data�� ����
			
			if(data == priorities[priorities.length-1-answer]) {
				answer++;
				location--;
				if(location < 0) break;
			}else {
				queue.add(data);
				location--;
				if(location < 0) location = queue.size()-1;
			}
		}
		
		return answer;
	}
}
