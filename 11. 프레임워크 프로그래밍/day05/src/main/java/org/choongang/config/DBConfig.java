package org.choongang.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {

        DataSource ds = new DataSource();

        /* 연결 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");
        /* 연결 설정 E */

        /* 커넥션 풀 설정 S */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setMinEvictableIdleTimeMillis(1000 * 60); // 1분이 기본값, 공부를 위해 일부러 적음
        ds.setTimeBetweenEvictionRunsMillis(1000 * 5); // 5초가 기본값, 이하동문
        /* 커넥션 풀 설정 E */

        return ds;
    }

}
