package com.zbin.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.zbin.springcloud.alibaba.PaymentProvider9002
 *
 * @author Zbin
 * @date 2020/04/03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProvider9002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentProvider9002.class, args);
  }
}
