package com.zbin.springcloud.alibaba.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * com.zbin.springcloud.alibaba.controller.OrderController
 *
 * @author Zbin
 * @date 2020/04/03
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

  @Resource
  private RestTemplate restTemplate;

  @Value("${service-url.nacos-user-service}")
  private String serverUrl;

  @GetMapping("/get/{id}")
  public String getById(@PathVariable("id") Long id) {
    return restTemplate.getForObject(serverUrl + "/payment/get/" + id, String.class);
  }

}
