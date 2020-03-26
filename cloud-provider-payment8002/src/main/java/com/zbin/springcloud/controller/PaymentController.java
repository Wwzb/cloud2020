package com.zbin.springcloud.controller;

import com.zbin.springcloud.entities.CommonResult;
import com.zbin.springcloud.entities.Payment;
import com.zbin.springcloud.service.PaymentService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.zbin.springcloud.controller.PaymentController
 *
 * @author Zbin
 * @date 2020/03/26
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @GetMapping("/get/{id}")
  public CommonResult<Payment> get(@PathVariable("id") Long id) {
    Payment payment = paymentService.get(id);
    if (payment == null) {
      return new CommonResult<>(444, "没有查到对应记录,id:" + id);
    } else {
      return new CommonResult<>(200, "查询成功", payment);
    }
  }

  @PostMapping("/create")
  public CommonResult<Payment> create(Payment payment) {
    int result = paymentService.create(payment);
    if (result == 0) {
      return new CommonResult<>(444, "插入数据库失败");
    } else {
      return new CommonResult<>(200, "插入数据库成功");
    }
  }
}
