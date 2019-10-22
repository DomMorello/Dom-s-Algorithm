package baekjoonAlgorithm;

import java.util.Scanner;

public class Alarm_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		final int MAX_MINUTE = 60;	//�� �������� 45���� �� �� �ʿ��ϱ� ������ ����� 60�� ����
		final int ALARM_MINUTE = 45;	//�������� ������ �˶��ð��� 45�� ����� �ϹǷ� ����
		final int MAX_HOUR = 23;	//�� �������� 0�� ���� 0�� �ƴ� ���� �����ؼ� ���Ǳ� ���ȿ� ����
		
		while(true) {
			
			String inputHour = scanner.next();
			String inputMinute = scanner.next();	//������ �������� ���� �� �ڸ� ���ڿ� �� �� �ڸ� ���ڸ� �����ϱ� ����
			
			
			int hour = Integer.parseInt(inputHour);	//String�� int�� ��ȯ
			int minute = Integer.parseInt(inputMinute);
			
			if((hour < 0 || hour > MAX_HOUR) || (minute < 0 || minute > 59)) {	//hour�� minute�� ������ ����� ���Է�
				System.out.println("Wrong. try again. Hour: 0~23, "
						+ "Minute: 0~59. ex) 12:24 -> 12 24");
			}else if(minute < ALARM_MINUTE && hour != 0) {	//hour�� 0�� �ƴϸ鼭 minute�� 45�� ������ ��
				hour -= 1;
				minute = MAX_MINUTE - ALARM_MINUTE + minute;
			}else if(minute < ALARM_MINUTE && hour == 0) {	//hour�� 0�̰� minute�� 45�� ������ ��
				hour = MAX_HOUR;
				minute = MAX_MINUTE - ALARM_MINUTE + minute; 
			}else if(minute >= ALARM_MINUTE) {	//minute�� 45�� �̻��̸� hour�� ������ ���� �ʰ� minute���� 45�� ���� ��
				minute -= ALARM_MINUTE; 
			}
			
			System.out.println(hour + " " + minute);
		} // for ����
	}

}
