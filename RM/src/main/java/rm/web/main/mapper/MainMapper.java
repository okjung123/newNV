package rm.web.main.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import rm.web.main.controller.Paging;
import rm.web.main.vo.UserVO;

@Mapper
public interface MainMapper {

	public void userSearch();
	public ArrayList<UserVO> selectUserList(Paging page);

	
} //all close
