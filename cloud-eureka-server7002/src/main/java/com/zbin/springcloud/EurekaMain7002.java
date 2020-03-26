package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.zbin.springcloud.EurekaMain7002
 *
 * @author Zbin
 * @date 2020/03/26
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7002.class, args);
  }
}
