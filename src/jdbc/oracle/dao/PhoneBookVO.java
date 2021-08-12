package jdbc.oracle.dao;

public class PhoneBookVO {
	// 필드
	// VO 객체에서는 기본 타입 대신 Wrapper 사용
	private Long Id;
	private String Name;
	private String Hp;
	private String Tel;
	
	// 생성자 - 기본 생성자가 필요
	public PhoneBookVO() {
	}
	
	public PhoneBookVO(String name) {
		Name = name;
	}
	
	public PhoneBookVO(Long id, String name, String hp, String tel) {
		Id = id;
		Name = name;
		Hp = hp;
		Tel = tel;

	}
	
//	public PhoneBookVO(String name, String hp, String tel) {
//		Name = name;
//		Hp = hp;
//		Tel = tel;
//
//	}
	

	

	public Long getPhoneBookId() {
		return Id;
	}

	public void setPhoneBookId(Long id) {
		this.Id = id;
	}

	public String getPhoneBookName() {
		return Name;
	}

	public void setPhoneBookName(String name) {
		this.Name = name;
	}

	public String getPhoneBookHp() {
		return Hp;
	}

	public void setPhoneBookHp(String hp) {
		this.Hp = hp;
	}

	public String getPhoneBookTel() {
		return Tel;
	}

	public void setPhoneBookTel(String tel) {
		this.Tel = tel;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [Id=" + Id + ", Name=" + Name + ", Hp=" + Hp + ", Tel=" + Tel + "]";
	}



	
	
	
	
	
	
}