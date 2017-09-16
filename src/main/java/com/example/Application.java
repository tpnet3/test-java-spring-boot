package com.example;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

// 어플리케이션이 처음 시작되는 클래스입니다.
// @SpringBootApplication 은 스프링 부트 어플리케이션임을 선언하는 어노테이션입니다.
// @PropertySource 는 스프링 부트에 대한 properties 파일을 불러옵니다.
// @MapperScan 은 interface 형태의 Mapper 를 스캔합니다.
@SpringBootApplication
@PropertySource("classpath:application.properties")
@MapperScan("com.example.mapper")
public class Application {

    @Value("${spring.datasource.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String jdbcUsername;

    @Value("${spring.datasource.password}")
    private String jdbcPassword;

    // 처음 시작되는 메소드입니다.
    public static void main(String[] args) {

        // 스프링 어플리케이션을 현재의 클래스를 바탕으로 실행합니다.
        // 기본 포트 번호는 8080 이고, application.properties 파일에서 설정할 수 있습니다.
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(jdbcDriverClassName);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}