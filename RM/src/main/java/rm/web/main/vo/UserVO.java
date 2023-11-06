package rm.web.main.vo;

import lombok.Data;

@Data
public class UserVO implements java.io.Serializable{
	private static final long serialVersionUID = 2950279914696632977L;
	
	private String mem_idx;  	//회원번호
	private String mem_id;  	//아이디
	private String mem_pw;  	//비번
	private String mem_name;  	//이름
	private String mem_num;  	//휴대폰번호
	private String mem_cre;  	//가입일
	private String mem_date;  	//접속기록
	private String mem_update;  //정보수정일
	private String mem_admin;
	private String mem_stat;
	private String mem_obs;
	
	

} //all close
