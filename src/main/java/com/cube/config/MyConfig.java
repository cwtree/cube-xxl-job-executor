package com.cube.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年2月10日
 */
@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "xxl.job")
public class MyConfig {

	@Value("${xxl.job.admin.addresses}")
	private String adminAddress;
	@Value("${xxl.job.accessToken}")
	private String accessToken;
	@Value("${xxl.job.executor.appname}")
	private String executorAppname;
	@Value("${xxl.job.executor.address}")
	private String executorAddress;
	@Value("${xxl.job.executor.ip}")
	private String executorIp;
	@Value("${xxl.job.executor.port}")
	private int executorPort;
	@Value("${xxl.job.executor.logpath}")
	private String executorLogpath;
	@Value("${xxl.job.executor.logretentiondays}")
	private int executorLogretentiondays;
	
}
