package rm.web.main.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import rm.web.main.controller.Paging;
import rm.web.main.vo.UserVO;


public interface MainService {
	

	UserVO selectUser(String mem_id);		// 회원 1명 조회
	ArrayList<UserVO> selectUserList(Paging page);	//회원 리스트 조회
}
