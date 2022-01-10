import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo info = null;			//info값을 초기화
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] infoArr = new PhoneInfo[100];
		//자료형이 PhoneInfo, 최대 100까지 허용
		String name = null, phoneNum = null, birth = null;
		int menu = 0;
		int cnt = 0;
		boolean sflag = false;
		//인덱스를 활용한 검색
		while(true)
		{
			System.out.println("선택하세요");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터 삭제");
			System.out.println("4.모든 데이터 보기");
			System.out.println("5.프로그램 종료");
			System.out.println("선택:");
			menu = sc.nextInt();	//1 엔터
			sc.nextLine();			//버퍼 값을 비우기

			switch(menu) 
			{
			case 1:	
				System.out.println("데이터 입력을 시작합니다.");
				System.out.println("이름:");
				name = sc.nextLine();
				System.out.println("전화번호:");
				phoneNum = sc.nextLine();
				System.out.println("생년월일:");
				birth = sc.nextLine();
				info = new PhoneInfo(name, phoneNum, birth);
				infoArr[cnt++] = info;				//idx에 정보 저장하는 메소드
				System.out.println("데이터 입력이 완료되었습니다.");
				break;
			case 2 :
				System.out.println("데이터 검색을 시작합니다");
				name = sc.nextLine();
				for(int i=0; i<cnt; i++)
				{
					if(name.compareTo(infoArr[i].getName())==0){
						infoArr[i].showPhoneInfo();
						sflag = true;
					}
				}
			case 3 :
				break;
			case 4 :
				for(int i=0; i<cnt; i++)
					infoArr[i].showPhoneInfo();
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				return;		
			default :
				System.out.println("잘못 선택하셨습니다.");
			}		
		}		
	}
}
