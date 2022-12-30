package info.vo;

//학생 정보를 저장하는 Object(Value Object)
//필드 : 값을 저장하기 위한 //대부분 프라이빗
//setter, Getter 메소드: 필드 값을 설정 또는 반환하는 메소드
//생성자 : 전체 필드 값을 초기화

public class StudentVo {
	private String name; //성명
	private int stuid; //학번
	private int grade; //학년
	private String major; //전공
	private String mobile; //핸드폰
	private String address; //주소
	
	//생성자 //using field //초기화
	public StudentVo(String name, int stuid, int grade, String major, String mobile, String address) {
		this.name = name;
		this.stuid = stuid;
		this.grade = grade;
		this.major = major;
		this.mobile = mobile;
		this.address = address;
	}
	
	//getting and setting 필드값 반환
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", stuid=" + stuid + ", grade=" + grade + ", major=" + major + ", mobile="
				+ mobile + ", address=" + address + "]";
	}
	
	
}
