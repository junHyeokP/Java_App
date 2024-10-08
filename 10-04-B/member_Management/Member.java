package member_Management;

import java.util.Date;

public class Member {
	
	private String ID;
	private String name;
	private String password;
	private String email_ID;
	private String email_Domain;
	private String tel1;
	private String tel2;
	private String tel3;
	private String post;
	private String basic_Addr;
	private String detail_Addr;
	private String Type;
	String REG_DATE;
	
	Member() {
		
	}
	
	Member(String ID, String name, String password) {
		this.ID = ID;
		this.name = name;
		this.password = password;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_ID() {
		return email_ID;
	}

	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getEmail_Domain() {
		return email_Domain;
	}

	public void setEmail_Domain(String email_Domain) {
		this.email_Domain = email_Domain;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getBasic_Addr() {
		return basic_Addr;
	}

	public void setBasic_Addr(String basic_Addr) {
		this.basic_Addr = basic_Addr;
	}

	public String getDetail_Addr() {
		return detail_Addr;
	}

	public void setDetail_Addr(String detail_Addr) {
		this.detail_Addr = detail_Addr;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}

	@Override
	public String toString() {
		return "Member [ID=" + ID + ", name=" + name + ", password=" + password + "]";
	}
	
}
