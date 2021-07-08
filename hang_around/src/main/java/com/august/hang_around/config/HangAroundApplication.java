package com.august.hang_around.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author 战神
 */
@ComponentScan("com.august")
@SpringBootApplication
@MapperScan("com.august.hang_around.mapper")
public class HangAroundApplication {
	private static final Logger LOG = LoggerFactory.getLogger(HangAroundApplication.class);
	public static void main(String[] args) {

		SpringApplication app =  new SpringApplication(HangAroundApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("server is running！！");
		LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}


}
