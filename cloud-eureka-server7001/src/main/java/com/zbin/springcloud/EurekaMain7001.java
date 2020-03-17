package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.zbin.springcloud.EurekaMain7001
 *
 * @author Zbin
 * @date 2020/03/17
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class, args);
  }
}
