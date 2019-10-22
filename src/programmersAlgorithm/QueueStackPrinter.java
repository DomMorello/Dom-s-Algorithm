package programmersAlgorithm;
import java.util.*;
/**
 * @author Dom_Morello
 * @Project Algorithm
 * @Date 2019. 10. 16.
 */
public class QueueStackPrinter {
	/*���α׷��ӽ� ������ �˰��� ù ��° �õ�
	 * �ڷ� ���� �̿��� �˰��� ù ȸ �����.
	 * 15�� �׽�Ʈ �� 2���� ���̽����� ������.
	 * ������������ ���ĵ��ִ� ��� ��κ� �����߻�.
	 *  https://programmers.co.kr/learn/courses/30/lessons/42587
	 *  */

	public static void main(String[] args) {
		
        int[] priorities1 = {2,1,3,2};
        System.out.println(solution(priorities1, 2));
        int[] priorities2 = {1,1,9,1,1,1};
        System.out.println(solution(priorities2, 0));

		
	}
	
	public static int solution(int[] priorities, int location) {
		int tmp = 0;	//q���� poll�ؼ� ��� ������ �α� ���� �������
		int tmpLocation = 0;	//qLocation���� poll�ؼ� ��� ������ �α� ���� �������
		Queue q = new LinkedList();	//ť ��ü ����
		Queue qLocation = new LinkedList();	//location�� �����ϱ� ���� ť ����
		Queue q2 = new LinkedList(); //�켱������ ���� ���ĵ� �μ����� ��� ���� ����
		Queue q2Location = new LinkedList();	//�켱������ ���� ���ĵ� �μ����� location�� ��� ���� ����
		
		//priorities�迭�� ��� �ִ� ����Ʈ ����� q �� ������. 
		for(int i=0; i < priorities.length; i++) {
			q.add(priorities[i]);
		}
		
		int[] qLocationArr = new int[priorities.length];
		
		for(int i=0; i < priorities.length; i++) {
			qLocationArr[i] = i;
		}
		
		//q�� ��Ȯ�ϰ� ���� �����̸鼭 q�� ������ �̵��� �� �� ��ü�� Ư���� �� �ִ� location�� ���� �̵��� �� �ֵ��� ����.
		//�켱 �� �ݺ������� ���ʰ����� location�� 0,1,2,3���� �ʱ�ȭ��.
		for(int i=0; i < priorities.length; i++) {
			qLocation.add(i);
		}
		
		for(int i=0; i < q.size(); i++) {
			tmp = (int)q.poll();	//tmp�� q ť�� ���� ���� �����ִ� �μ����� �ϴ� �����ص�.
			tmpLocation = (int)qLocation.poll();
			
			Iterator it = q.iterator();	//qť�� ��ü�� ���ʴ�� �����ϸ鼭 �˻��ϱ� ���� Iterator��ü ����
			Iterator itLocation = qLocation.iterator();

			while(it.hasNext()) {	//q�� ��ü�� ���������� 
				if(tmp < (int)it.next()) {	//tmp�� poll�ؼ� ���� ��ü�� �����ִ� ��ü���� ���ʷ� ����
					q.add(tmp);	//tmp�� �񱳰�ü �� �ϳ��� ���� ���� �߰ߵǸ� �ٽ� q�� �߰��ϰ�
					qLocation.add(tmpLocation);
					break;	//�񱳸� �׸��ΰ� �ݺ����� ���´�
				}else {
					if(!it.hasNext()) {	//tmp�� ũ�ٸ� ������ ����ϰ� ���̻� ����� ��ü�� �������� �ʴٸ�
						q2.add(tmp);	//���ο� Queue�� q2�� �ְ�
						q2Location.add(tmpLocation);
						i = 0;			//i�� 0���� �ʱ�ȭ�ؼ� �ٽ� for�ݺ����� ó������ �����Ѵ�.
					}
				}
			}//while��
		}//for��
		if(q.size() == 1) {
			q2.add(q.poll());	//q�� �ϳ��� �������� ���� �̸� ������ ���ο� q2�� ��´�.
			q2Location.add(qLocation.poll());
		}
		
//		System.out.println(q2);	//����� �ϸ� �켱������ ���� �μ������ ������ �ȴ�.
//		System.out.println(q2Location);
		
		int[] q2Arr = new int[priorities.length];
		int[] q2LocationArr = new int[priorities.length];
		
		//q2�� ��ü���� q2Arr�� ����
		for(int i=0; i < q2Arr.length; i++) {
			q2Arr[i] = (int)q2.poll();
		}
		//q2Location�� ��ü���� q2LocationArr�� ����
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
