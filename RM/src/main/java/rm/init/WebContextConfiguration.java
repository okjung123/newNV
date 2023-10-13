package rm.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 웹 컨텍스트 설정파일
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"rm.web"})
public class WebContextConfiguration {

	/**
     * 뷰 리졸버를 설정한다.
     * @return
     */
    @Bean
    public ViewResolver getViewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".html");

        return resolver;

    }
	
}
