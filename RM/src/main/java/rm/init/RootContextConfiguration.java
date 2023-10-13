package rm.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 루트 컨텍스트 설정파일
 */
@Configuration
@Import({ContextDataSource.class, ContextSqlMapper.class}) //설정 클래스들을 import 합니다.
@ComponentScan(basePackages = {"rm.web"}) //서비스 빈 객체들을 등록합니다.
public class RootContextConfiguration {

}
