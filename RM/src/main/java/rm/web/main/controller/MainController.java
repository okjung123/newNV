package rm.web.main.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import rm.web.main.service.MainService;
import rm.web.main.vo.UserVO;

/**
 * 프로젝트내에서 롬복 설치 방법
 * Java Resources -> Libraries -> maven Dependencies -> lombok-1.18.6.jar 파일 마우스 우클릭
 * Run As -> Java Application 클릭
 * Specify location... 클릭
 * 이클립스 경로 찾아서 선택
 * [이클립스 경로 찾는 방법
 *   1. 이클립스 바로가기 우클릭
 *   2. 바로가기 탭의 대상(T) 내용 복사
 *   3. 복사한 내용의 맨 뒤 \eclipse.exe 내용 삭제 후 실행]
 * eclipse.exe 파일 선택 후 Install / Update 버튼 클릭
 * Install successful 메시지가 뜨면 창 종료
 * 설치 완료 후 이클립스 재시작
 * */
@Controller
public class MainController {
	
	public static void main(String[] args) {
		System.out.println("test");
	}
	
	@Autowired 									
	private MainService MainService;
	//private BCryptPasswordEncoder bcryptPasswordEncoder;	
		
	
	
	
	@RequestMapping(value= "/main/index.do", method= RequestMethod.GET)
    public String home() {
        return "main/index";
    }
	
	
	@RequestMapping(value= "/main/front.do", method= RequestMethod.GET)
    public String front() {
        return "main/front";
    }
	
	
//	
//	//로그인 요청처리용
//	@RequestMapping(value="/main/login.do", method= {RequestMethod.GET, RequestMethod.POST })
//	public ModelAndView selectUser(ModelAndView mv, UserVO user, HttpSession session, SessionStatus status,Model model) {
//		
//		//전달온 회원 아이디로 먼저 정보조회함
//		UserVO loginUser = MainService.selectUser(user.getMem_id());
//		 if (loginUser.getMem_pw() != null)  {
//			
//		    session.setAttribute("loginUser", loginUser);
//		    status.setComplete();		//로그인 요청 성공 => 200을 전송하면 문제없는것임
//		    mv.setViewName("main/front");
//		    System.out.println("로그인 완료");
//		    
//		} else {
//			model.addAttribute("message", "로그인 실패 : 아이디나 암호를 확인해주세요<br>" + "또는, 로그인 제한된 회원인지 관리자에게 문의하세요.");	
//			mv.setViewName("main/error");
//		}//if
//		return mv;
//	}//method close
//	
//	
	
	
	
	
	
}//all class close
