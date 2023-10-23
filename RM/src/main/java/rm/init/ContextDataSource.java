package rm.init;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 데이터베이스 설정
 */
@Configuration
// 어노테이션 기반 트랜잭션 관리를 사용 합니다.
// <tx:annotation-driven>
@EnableTransactionManagement
public class ContextDataSource {

	/**
     * 데이터소스 등록
	 * @return
	 */
	@Bean(destroyMethod="close")
	public DataSource dataSource() {

		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver"); 
		dataSource.setUrl("jdbc:postgresql://localhost:5432/routemate"); //127.0.0.1 = localhost
		dataSource.setUsername("ttwmrk2002"); //이메일
		dataSource.setPassword("qwer1234"); //3579  혹은 qwer1234
//		dataSource.setDefaultAutoCommit(false);

		return dataSource;
	}

	/**
	 * 트랜잭션 매니저 등록
	 * @return
	 */
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
	
}
