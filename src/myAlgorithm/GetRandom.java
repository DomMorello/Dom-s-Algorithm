package myAlgorithm;

public class GetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] LEGEND = {"�Ƿη�","ũ��","����","��Ƽ","����","�ظ�","������","����"};
		String[] SUPER = {"���̾��","�����̴���","ķƾAm","���۸�"};
		String[] RARE = {"����","�ȳ�","�����"};
		String[] NORMAL = {"���","����","����","��ũ"};
		int[] count= new int[4];	//�� String�迭�� ��µ� ������ ī��Ʈ�� ���� ���� �迭
		
		//�Ʒ��� ���� Ȯ���� String�迭�� ��ҵ��� �����ϰ� �̾Ƴ���. 30�� �ݺ�
		for(int i=1; i < 31; i++) {
			int ranNum = (int)(Math.random()*100)+1;

			if(ranNum <= 5) {
				count[0]++;
				System.out.println(i+"ȸ�� LEGEND "+LEGEND[(int)(Math.random()*LEGEND.length)]);
			}else if(ranNum <= 20) {
				count[1]++;
				System.out.println(i+"ȸ�� SUPER "+SUPER[(int)(Math.random()*SUPER.length)]);
			}else if(ranNum <= 50) {
				count[2]++;
				System.out.println(i+"ȸ�� RARE "+RARE[(int)(Math.random()*RARE.length)]);
			}else{
				count[3]++;
				System.out.println(i+"ȸ�� NORMAL "+NORMAL[(int)(Math.random()*NORMAL.length)]);
			}
		}
		System.out.println("--------------------------------");
		System.out.println("30ȸ ���� ���:");
		System.out.printf("LEGEND: %dȸ (%.2f%%) \n",count[0], ((float)count[0]/30)*100);
		System.out.printf("SUPER: %dȸ (%.2f%%) \n",count[1], ((float)count[1]/30)*100);
		System.out.printf("RARE: %dȸ (%.2f%%) \n",count[2], ((float)count[2]/30)*100);
		System.out.printf("NORMAL: %dȸ (%.2f%%) \n",count[3], ((float)count[3]/30)*100);

	}

}
