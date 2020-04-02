package com.zbin.springcloud.controller;

import com.zbin.springcloud.entities.CommonResult;
import com.zbin.springcloud.entities.Payment;
import com.zbin.springcloud.service.PaymentService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.controller.PaymentController
 *
 * @author Zbin
 * @date 2020/03/16
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @PostMapping("/create")
  public CommonResult<Integer> create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    log.info("******插入结果:" + result);
    if (result > 0) {
      return new CommonResult<>(200, "插入数据库成功,端口号:" + serverPort, result);
    } else {
      return new CommonResult<>(444, "插入数据库失败", null);
    }
  }

  @GetMapping("/get/{id}")
  public CommonResult<Payment> get(@PathVariable("id") Long id) {
    Payment payment = paymentService.getById(id);
    log.info("******查询结果:" + payment);
    if (payment != null) {
      return new CommonResult<>(200, "查询成功,端口号:" + serverPort, payment);
    } else {
      return new CommonResult<>(444, "没有对应记录,查询id:" + id, null);
    }
  }
}
