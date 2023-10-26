package rm.web.main.mapper;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import rm.web.main.controller.Paging;
import rm.web.main.vo.UserVO;

//이 mapper interface를 타고 진짜 mapper.xml로 넘어간다 (resources 폴더 안에 있음)
@Mapper
public interface MainMapper {
	public void userSearch(); 
	public UserVO selectUser(String mem_id);	// 회원 1명 조회
	
	
	public ArrayList<UserVO> selectUserList(Paging page);  //회원 리스트 조회

	
} //all close


