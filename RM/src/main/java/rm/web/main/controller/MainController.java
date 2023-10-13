package rm.web.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/main/index.do")
    public String home() {
        return "main/index";
    }
	
	/**
	 * 프로젝트내에서 롬복 설치 방법
	 * 
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
	
	
}
