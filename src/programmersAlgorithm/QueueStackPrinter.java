package programmersAlgorithm;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 16.
 */
public class QueueStackPrinter {
	/*프로그래머스 프린터 알고리즘 첫 번째 시도
	 * 자료 구조 이용한 알고리즘 첫 회 대실패.
	 * 15개 테스트 중 2개의 케이스에서 실패함.
	 * 오름차순으로 정렬돼있는 경우 대부분 오류발생.
	 *  https://programmers.co.kr/learn/courses/30/lessons/42587
	 *  */

	public static void main(String[] args) {
		
        int[] priorities1 = {2,1,3,2};
        System.out.println(solution(priorities1, 2));
        int[] priorities2 = {1,1,9,1,1,1};
        System.out.println(solution(priorities2, 0));

		
	}
	
	public static int solution(int[] priorities, int location) {
		int tmp = 0;	//q에서 poll해서 잠시 저장해 두기 위한 저장공간
		int tmpLocation = 0;	//qLocation에서 poll해서 잠시 저장해 두기 위한 저장공간
		Queue q = new LinkedList();	//큐 객체 생성
		Queue qLocation = new LinkedList();	//location을 저장하기 위한 큐 생성
		Queue q2 = new LinkedList(); //우선순위에 맞춰 정렬된 인쇄목록을 담기 위해 생성
		Queue q2Location = new LinkedList();	//우선순위에 맞춰 정렬된 인쇄목록의 location을 담기 위해 생성
		
		//priorities배열에 담겨 있는 프린트 목록을 q 에 저장함. 
		for(int i=0; i < priorities.length; i++) {
			q.add(priorities[i]);
		}
		
		int[] qLocationArr = new int[priorities.length];
		
		for(int i=0; i < priorities.length; i++) {
			qLocationArr[i] = i;
		}
		
		//q와 정확하게 같이 움직이면서 q의 값들이 이동할 때 그 객체를 특정할 수 있는 location도 같이 이동할 수 있도록 만듦.
		//우선 이 반복문에서 최초값으로 location을 0,1,2,3으로 초기화함.
		for(int i=0; i < priorities.length; i++) {
			qLocation.add(i);
		}
		
		for(int i=0; i < q.size(); i++) {
			tmp = (int)q.poll();	//tmp에 q 큐의 가장 먼저 들어와있는 인쇄목록을 일단 저장해둠.
			tmpLocation = (int)qLocation.poll();
			
			Iterator it = q.iterator();	//q큐의 객체를 차례대로 접근하면서 검사하기 위해 Iterator객체 생성
			Iterator itLocation = qLocation.iterator();

			while(it.hasNext()) {	//q에 객체가 남아있으면 
				if(tmp < (int)it.next()) {	//tmp에 poll해서 담은 객체와 남아있는 객체들을 차례로 비교함
					q.add(tmp);	//tmp가 비교객체 중 하나라도 작은 것이 발견되면 다시 q에 추가하고
					qLocation.add(tmpLocation);
					break;	//비교를 그만두고 반복문을 나온다
				}else {
					if(!it.hasNext()) {	//tmp가 크다면 끝까지 계산하고 더이상 계산할 객체가 남아있지 않다면
						q2.add(tmp);	//새로운 Queue인 q2애 넣고
						q2Location.add(tmpLocation);
						i = 0;			//i를 0으로 초기화해서 다시 for반복문을 처음부터 시작한다.
					}
				}
			}//while끝
		}//for끝
		if(q.size() == 1) {
			q2.add(q.poll());	//q에 하나만 남아있을 때는 이를 꺼내서 새로운 q2에 담는다.
			q2Location.add(qLocation.poll());
		}
		
//		System.out.println(q2);	//출력을 하면 우선순위에 맞춰 인쇄순서가 정렬이 된다.
//		System.out.println(q2Location);
		
		int[] q2Arr = new int[priorities.length];
		int[] q2LocationArr = new int[priorities.length];
		
		//q2의 객체들을 q2Arr에 복사
		for(int i=0; i < q2Arr.length; i++) {
			q2Arr[i] = (int)q2.poll();
		}
		//q2Location의 객체들을 q2LocationArr에 복사
		for(int i=0; i < q2LocationArr.length; i++) {
			q2LocationArr[i] = (int)q2Location.poll();
		}
		
		int answer = qLocationArr[location];
		int index = 0;
		for(int i=0; i < q2LocationArr.length; i++) {
			if(q2LocationArr[i] == answer) {
				index = i;
				break;
			}
		}
		
		return index + 1;
	}

}
