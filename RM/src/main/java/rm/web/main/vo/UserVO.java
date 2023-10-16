package rm.web.main.vo;

import lombok.Data;


public class UserVO implements java.io.Serializable{
	private static final long serialVersionUID = 2950279914696632977L;
	
	private String mem_idx;  	//회원번호
	private String mem_id;  	//아이디
	private String mem_pw;  	//비번
	private String mem_name;  //이름
	private String mem_num;  //휴대폰번호
	private String mem_cre;  //가입일
	private String mem_date;  //접속기록
	private String mem_update;  //정보수정일
	
	
	public UserVO() {
		super();
	}


	public String getMem_idx() {
		return mem_idx;	
	}



	public void setMem_idx(String mem_idx) {
		this.mem_idx = mem_idx;
	}



	public String getMem_id() {
		return mem_id;
	}



	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}



	public String getMem_pw() {
		return mem_pw;
	}



	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}



	public String getMem_name() {
		return mem_name;
	}



	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}



	public String getMem_num() {
		return mem_num;
	}



	public void setMem_num(String mem_num) {
		this.mem_num = mem_num;
	}



	public String getMem_cre() {
		return mem_cre;
	}



	public void setMem_cre(String mem_cre) {
		this.mem_cre = mem_cre;
	}



	public String getMem_date() {
		return mem_date;
	}



	public void setMem_date(String mem_date) {
		this.mem_date = mem_date;
	}



	public String getMem_update() {
		return mem_update;
	}



	public void setMem_update(String mem_update) {
		this.mem_update = mem_update;
	}



	public UserVO(String mem_idx, String mem_id, String mem_pw, String mem_name, String mem_num, String mem_cre,
			String mem_date, String mem_update) {
		super();
		this.mem_idx = mem_idx;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_num = mem_num;
		this.mem_cre = mem_cre;
		this.mem_date = mem_date;
		this.mem_update = mem_update;
	}


} //all close
