
public class PhoneInfo {
	private String name;
	private String phoneNum;
	private String birth;
	
	PhoneInfo(String name, String phoneNum, String birth)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	public void showPhoneInfo()
	{
		System.out.println("이름"+name);
		System.out.println("전화번호"+phoneNum);
		System.out.println("생일"+birth);
	}
	public String getName()
	{
		return name;
	}
}
