package com.cube.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年4月7日
 */
@Configuration
@Slf4j
public class XxlExecutorConfig {

	@Resource
	private MyConfig myConfig;

	@Bean
	public XxlJobSpringExecutor xxlJobExecutor() {
		if (log.isInfoEnabled()) {
			log.info("XxlJobSpringExecutor init ...");
		}
		XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
		xxlJobSpringExecutor.setAdminAddresses(myConfig.getAdminAddress());
		xxlJobSpringExecutor.setAppname(myConfig.getExecutorAppname());
		xxlJobSpringExecutor.setIp(myConfig.getExecutorIp());
		xxlJobSpringExecutor.setPort(myConfig.getExecutorPort());
		xxlJobSpringExecutor.setAccessToken(myConfig.getAccessToken());
		xxlJobSpringExecutor.setLogPath(myConfig.getExecutorLogpath());
		xxlJobSpringExecutor.setLogRetentionDays(myConfig.getExecutorLogretentiondays());
		return xxlJobSpringExecutor;
	}

}
