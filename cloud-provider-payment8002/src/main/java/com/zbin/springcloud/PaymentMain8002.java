package com.zbin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * com.zbin.springcloud.PaymentMain8002
 *
 * @author Zbin
 * @date 2020/03/26
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8002.class, args);
  }
}
