package programmersAlgorithm;
import java.util.*;
public class QueueStackPrinterVer2 {
	public static void main(String[] args) {
		/*
		 * �ٸ� ����  �ۼ��� �ڵ� ����
		 * ��ó: https://github.com/os94/Algorithm-Study/blob/master/ohsang/Programmers/Stack%2CQueue/Printer.java
		 */
		 int[] priorities1 = {2,1,3,2};
	     System.out.println(solution(priorities1, 2));
	     int[] priorities2 = {1,1,9,1,1,1};
	     System.out.println(solution(priorities2, 0));
		
	}
	
    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        //priorities�迭�� {2,1,3,2}��� �������� ��
        //�Ʒ� �ݺ����� ����� queue = [{0,2}, {1,1}, {2,3}. {3,2}] �� �����
        for(int i=0; i<priorities.length; i++) {
            int[] data = {i, priorities[i]};	//data �����迭�� ��ġ�� Ư���� �� �ִ� �ε����� i���� �Ű������� ������ �迭�� �� ��ҵ��� ����
            queue.add(data);	//data �����迭�� ����� �� ���� ��Ҹ� queue�� �����ϸ鼭 �ݺ����� ���������� ���� ����
        }

        int cnt = 0;
        while (true) {
            int[] popData = queue.poll();	//queue���� ���� ����� ������ �켱�Ͽ� ������ popData�����迭�� ����
            boolean flag = false;	//�Ʒ� if���ǹ��� ����  �� �� ������ ���ϱ� ���� ����
            for(int[] data : queue) {	
                if(popData[1] < data[1]) {	//queue���� ���� �տ� �ִ� �迭�� ������ popData�� �����ϰ� �� �迭�� �ε����� 1�� ��, 
                							//�ι�°�� ��Ҹ� queue�� �ִ� �迭�� ó������ ������ index�� 1�� ��ҿ� ũ�⸦ ���Ѵ�
                    queue.add(popData);		//popData�� ��� �迭�� index 1 ��Ұ� data���� ������ queue�� �� ���������� �ٽ� �����Ѵ�.
                    flag = true;	//true�� �����ν� �Ʒ��� �ִ� if���� �������� �ʰ� �Ѵ�
                    break;
                }
            }//for��
            if(!flag) {	//���� for�ݺ������� ���̻� popData[1]�� ���� data[1]������ ������ ������ flag�� false�� ���·� �Ǿ� �� ���ǹ��� �����
                cnt++;	//�켱 cnt�� 1 ������Ű��
                if(popData[0]==location)	//�Ű������� �޴� location�� popData[0]��ҿ� ������ ���ϰ� �ٸ��� while�ݺ����� ���� �ٽ� 
                							//if���� ����ǰ� cnt�� 1�����Ǿ� ���°�� ��µǴ����� ������ ��ȯ�� �� �ִ�.
                    break;
            }
        }//while��

        return cnt;
    }
}
