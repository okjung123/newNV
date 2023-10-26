package rm.web.main.service.impl;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rm.web.main.controller.Paging;
import rm.web.main.mapper.MainMapper;
import rm.web.main.service.MainService;
import rm.web.main.vo.UserVO;

@Service("MainService")
public class MainServiceImpl implements MainService {
	
	@Autowired MainMapper mainMapper;
	@Autowired	private SqlSessionTemplate session;	


	@Override
	public void userSearch() {
		return;
	}
	
	@Override 
	public UserVO selectUser(String mem_id) {		// 회원 1명 조회
		return session.selectOne("mainMapper.selectUser", mem_id);
	}


	@Override
	public ArrayList<UserVO> selectUserList(Paging page) { 	//회원 리스트 조회
		return mainMapper.selectUserList(page);
	}



	
	
	
	
	
	
	
	
}//all close









