import java.util.Random;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		
		int com[] = new int[3];		//컴퓨터 생성 숫자
		int user[] = new int[3];	// 사용자 입력 숫자
		int strike = 0, ball = 0;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean sflag = true;
		
		while(com[0]==0) {
			com[0]=r.nextInt(10);
		}
		while(com[0]==com[1] || com[1]==0) {
			com[1]=r.nextInt(10);
		}
		while(com[1]==com[2] || com[2]==0) {
			com[2]=r.nextInt(10);
		}
		
		while(true) {
			
			for(int i=0; i<3; i++) {
				System.out.println((i+1)+"번째 숫자를 입력하세요");	
				//편의를 위해서 i+1로 입력(인덱스위치때문에)
				user[i] = sc.nextInt();
			}
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(com[j] == user[i])
					{
						if(i==j)	//똑같은 자릿수에 있는 숫자가 있으므로 스트라이크
						strike++;
						
						else
							ball++;	//아니라면 볼
					}
				}
			}
			if(strike==3)
			{
				System.out.println("3스트라이크");
				System.out.println("3개의 숫자를 모두 맞추셨습니다! 게임종료.");
				System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
				int num = sc.nextInt();
				if(num==1)
				{
					sflag = true;
				}
				else {
					return;
				}
			}
			else if(strike==0 && ball==0)
			{
				System.out.println("nothing");
			}
			else 
			{
				System.out.println("Strike"+strike+"ball"+ball+"입니다.");
			}
		}
	}
}
