package com.zbin.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.alibaba.controller.PaymentController
 *
 * @author Zbin
 * @date 2020/04/03
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping("/get/{id}")
  public String getById(@PathVariable("id") Long id) {
    return "Get payment from server:" + serverPort + ", id:" + id;
  }
}
