package rm.init;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringStarter implements WebApplicationInitializer {
	
	/**

     * 컨텍스트를 시작한다.

     */

    @Override

    public void onStartup(ServletContext servletContext) throws ServletException {

        // Root Context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootContextConfiguration.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

        // Web Context
        AnnotationConfigWebApplicationContext dispatcherContext =  new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(WebContextConfiguration.class);

        // Dispatcher Servlet
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("*.do");

    }

}
