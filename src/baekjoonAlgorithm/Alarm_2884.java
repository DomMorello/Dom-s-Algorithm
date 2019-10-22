package baekjoonAlgorithm;

import java.util.Scanner;

public class Alarm_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		final int MAX_MINUTE = 60;	//분 단위에서 45분을 뺄 때 필요하기 때문에 상수로 60분 선언
		final int ALARM_MINUTE = 45;	//문제에서 제시한 알람시간은 45분 빨라야 하므로 선언
		final int MAX_HOUR = 23;	//시 단위에서 0일 때와 0이 아닐 때를 구분해서 사용되기 때믄에 선언
		
		while(true) {
			
			String inputHour = scanner.next();
			String inputMinute = scanner.next();	//공백을 기준으로 앞의 두 자리 숫자와 뒤 두 자리 숫자를 구분하기 위함
			
			
			int hour = Integer.parseInt(inputHour);	//String을 int로 변환
			int minute = Integer.parseInt(inputMinute);
			
			if((hour < 0 || hour > MAX_HOUR) || (minute < 0 || minute > 59)) {	//hour와 minute가 범위를 벗어나면 재입력
				System.out.println("Wrong. try again. Hour: 0~23, "
						+ "Minute: 0~59. ex) 12:24 -> 12 24");
			}else if(minute < ALARM_MINUTE && hour != 0) {	//hour는 0이 아니면서 minute은 45분 이하일 때
				hour -= 1;
				minute = MAX_MINUTE - ALARM_MINUTE + minute;
			}else if(minute < ALARM_MINUTE && hour == 0) {	//hour는 0이고 minute은 45분 이하일 때
				hour = MAX_HOUR;
				minute = MAX_MINUTE - ALARM_MINUTE + minute; 
			}else if(minute >= ALARM_MINUTE) {	//minute가 45분 이상이면 hour는 영향을 받지 않고 minute에서 45만 빼면 됨
				minute -= ALARM_MINUTE; 
			}
			
			System.out.println(hour + " " + minute);
		} // for 종료
	}

}
