package com.zbin.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * com.zbin.springcloud.config.ApplicationContextConfig
 *
 * @author Zbin
 * @date 2020/03/17
 */
@Configuration
public class ApplicationContextConfig {

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}