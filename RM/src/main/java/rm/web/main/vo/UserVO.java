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
	private String mem_admin;
	private String mem_stat;
	private String mem_obs;
	
	
	public UserVO() {
		super();
	}


	public UserVO(String mem_idx, String mem_id, String mem_pw, String mem_name, String mem_num, String mem_cre,
			String mem_date, String mem_update, String mem_admin, String mem_stat, String mem_obs) {
		super();
		this.mem_idx = mem_idx;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_num = mem_num;
		this.mem_cre = mem_cre;
		this.mem_date = mem_date;
		this.mem_update = mem_update;
		this.mem_admin = mem_admin;
		this.mem_stat = mem_stat;
		this.mem_obs = mem_obs;
	}


	@Override
	public String toString() {
		return "UserVO [mem_idx=" + mem_idx + ", mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_name=" + mem_name
				+ ", mem_num=" + mem_num + ", mem_cre=" + mem_cre + ", mem_date=" + mem_date + ", mem_update="
				+ mem_update + ", mem_admin=" + mem_admin + ", mem_stat=" + mem_stat + ", mem_obs=" + mem_obs + "]";
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


	public String getMem_admin() {
		return mem_admin;
	}


	public void setMem_admin(String mem_admin) {
		this.mem_admin = mem_admin;
	}


	public String getMem_stat() {
		return mem_stat;
	}


	public void setMem_stat(String mem_stat) {
		this.mem_stat = mem_stat;
	}


	public String getMem_obs() {
		return mem_obs;
	}


	public void setMem_obs(String mem_obs) {
		this.mem_obs = mem_obs;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mem_admin == null) ? 0 : mem_admin.hashCode());
		result = prime * result + ((mem_cre == null) ? 0 : mem_cre.hashCode());
		result = prime * result + ((mem_date == null) ? 0 : mem_date.hashCode());
		result = prime * result + ((mem_id == null) ? 0 : mem_id.hashCode());
		result = prime * result + ((mem_idx == null) ? 0 : mem_idx.hashCode());
		result = prime * result + ((mem_name == null) ? 0 : mem_name.hashCode());
		result = prime * result + ((mem_num == null) ? 0 : mem_num.hashCode());
		result = prime * result + ((mem_obs == null) ? 0 : mem_obs.hashCode());
		result = prime * result + ((mem_pw == null) ? 0 : mem_pw.hashCode());
		result = prime * result + ((mem_stat == null) ? 0 : mem_stat.hashCode());
		result = prime * result + ((mem_update == null) ? 0 : mem_update.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (mem_admin == null) {
			if (other.mem_admin != null)
				return false;
		} else if (!mem_admin.equals(other.mem_admin))
			return false;
		if (mem_cre == null) {
			if (other.mem_cre != null)
				return false;
		} else if (!mem_cre.equals(other.mem_cre))
			return false;
		if (mem_date == null) {
			if (other.mem_date != null)
				return false;
		} else if (!mem_date.equals(other.mem_date))
			return false;
		if (mem_id == null) {
			if (other.mem_id != null)
				return false;
		} else if (!mem_id.equals(other.mem_id))
			return false;
		if (mem_idx == null) {
			if (other.mem_idx != null)
				return false;
		} else if (!mem_idx.equals(other.mem_idx))
			return false;
		if (mem_name == null) {
			if (other.mem_name != null)
				return false;
		} else if (!mem_name.equals(other.mem_name))
			return false;
		if (mem_num == null) {
			if (other.mem_num != null)
				return false;
		} else if (!mem_num.equals(other.mem_num))
			return false;
		if (mem_obs == null) {
			if (other.mem_obs != null)
				return false;
		} else if (!mem_obs.equals(other.mem_obs))
			return false;
		if (mem_pw == null) {
			if (other.mem_pw != null)
				return false;
		} else if (!mem_pw.equals(other.mem_pw))
			return false;
		if (mem_stat == null) {
			if (other.mem_stat != null)
				return false;
		} else if (!mem_stat.equals(other.mem_stat))
			return false;
		if (mem_update == null) {
			if (other.mem_update != null)
				return false;
		} else if (!mem_update.equals(other.mem_update))
			return false;
		return true;
	}
	
	





} //all close
