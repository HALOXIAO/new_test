package main.MyWeb.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("main.MyWeb")
@PropertySource("classpath:application.properties")
@MapperScan("")
@EnableTransactionManagement
public class DapConfig {
@Bean
    public DataSource dataSource(PropertiesConfig propertiesConfig)

}
