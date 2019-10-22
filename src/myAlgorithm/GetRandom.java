package myAlgorithm;

public class GetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] LEGEND = {"뽀로로","크롱","포비","페티","에디","해리","통통이","루피"};
		String[] SUPER = {"아이언맨","스파이더맨","캠틴Am","슈퍼맨"};
		String[] RARE = {"엘사","안나","울라프"};
		String[] NORMAL = {"라바","옐로","레드","핑크"};
		int[] count= new int[4];	//각 String배열이 출력될 때마다 카운트를 세기 위한 배열
		
		//아래와 같은 확률로 String배열의 요소들을 랜덤하게 뽑아낸다. 30번 반복
		for(int i=1; i < 31; i++) {
			int ranNum = (int)(Math.random()*100)+1;

			if(ranNum <= 5) {
				count[0]++;
				System.out.println(i+"회차 LEGEND "+LEGEND[(int)(Math.random()*LEGEND.length)]);
			}else if(ranNum <= 20) {
				count[1]++;
				System.out.println(i+"회차 SUPER "+SUPER[(int)(Math.random()*SUPER.length)]);
			}else if(ranNum <= 50) {
				count[2]++;
				System.out.println(i+"회차 RARE "+RARE[(int)(Math.random()*RARE.length)]);
			}else{
				count[3]++;
				System.out.println(i+"회차 NORMAL "+NORMAL[(int)(Math.random()*NORMAL.length)]);
			}
		}
		System.out.println("--------------------------------");
		System.out.println("30회 종합 결과:");
		System.out.printf("LEGEND: %d회 (%.2f%%) \n",count[0], ((float)count[0]/30)*100);
		System.out.printf("SUPER: %d회 (%.2f%%) \n",count[1], ((float)count[1]/30)*100);
		System.out.printf("RARE: %d회 (%.2f%%) \n",count[2], ((float)count[2]/30)*100);
		System.out.printf("NORMAL: %d회 (%.2f%%) \n",count[3], ((float)count[3]/30)*100);

	}

}
