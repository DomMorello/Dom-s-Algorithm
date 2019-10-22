package programmersAlgorithm;
import java.util.*;
public class QueueStackPrinterVer2 {
	public static void main(String[] args) {
		/*
		 * 다른 분이  작성한 코드 공부
		 * 출처: https://github.com/os94/Algorithm-Study/blob/master/ohsang/Programmers/Stack%2CQueue/Printer.java
		 */
		 int[] priorities1 = {2,1,3,2};
	     System.out.println(solution(priorities1, 2));
	     int[] priorities2 = {1,1,9,1,1,1};
	     System.out.println(solution(priorities2, 0));
		
	}
	
    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        //priorities배열이 {2,1,3,2}라고 가정했을 때
        //아래 반복문의 결과로 queue = [{0,2}, {1,1}, {2,3}. {3,2}] 가 저장됨
        for(int i=0; i<priorities.length; i++) {
            int[] data = {i, priorities[i]};	//data 정수배열에 위치를 특정할 수 있는 인덱스인 i값과 매개변수로 들어오는 배열의 각 요소들을 저장
            queue.add(data);	//data 정수배열에 저장된 두 개의 요소를 queue에 축적하면서 반복문이 끝날때까지 전부 저장
        }

        int cnt = 0;
        while (true) {
            int[] popData = queue.poll();	//queue에서 먼저 저장된 값들을 우선하여 꺼내서 popData정수배열에 저장
            boolean flag = false;	//아래 if조건문을 실행  할 지 말지를 정하기 위한 변수
            for(int[] data : queue) {	
                if(popData[1] < data[1]) {	//queue에서 가장 앞에 있는 배열을 꺼내서 popData에 저장하고 그 배열의 인덱스가 1인 즉, 
                							//두번째인 요소를 queue에 있는 배열의 처음부터 끝가지 index가 1인 요소와 크기를 비교한다
                    queue.add(popData);		//popData에 담긴 배열의 index 1 요소가 data보다 작으면 queue의 맨 마지막으로 다시 저장한다.
                    flag = true;	//true로 함으로써 아래에 있는 if문을 실행하지 않게 한다
                    break;
                }
            }//for끝
            if(!flag) {	//위의 for반복문에서 더이상 popData[1]의 값이 data[1]값보다 작은게 없으면 flag가 false인 상태로 되어 이 조건문이 실행됨
                cnt++;	//우선 cnt를 1 증감시키고
                if(popData[0]==location)	//매개변수로 받는 location이 popData[0]요소와 같은지 비교하고 다르면 while반복문에 의해 다시 
                							//if문이 실행되고 cnt가 1증감되어 몇번째에 출력되는지를 정수로 반환할 수 있다.
                    break;
            }
        }//while끝

        return cnt;
    }
}
