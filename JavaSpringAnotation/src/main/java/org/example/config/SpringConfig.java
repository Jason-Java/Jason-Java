package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


/**
 * 用注解的方式替换配置文件
 */
@Configuration   //把此类变成配置文件
@ComponentScan("org.example.dao") //自动扫描注解标注的bean
@PropertySource("JDBC.properties") //指明外部属性文件
@Import({JDBCConfig.class}) //add other Bean
public class SpringConfig {
}
