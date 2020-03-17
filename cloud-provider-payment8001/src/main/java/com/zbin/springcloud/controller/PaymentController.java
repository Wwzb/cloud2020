package com.zbin.springcloud.controller;

import com.zbin.springcloud.entity.CommentResult;
import com.zbin.springcloud.entity.Payment;
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
 * @date 2020/03/16
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @PostMapping("/create")
  public CommentResult create(Payment payment) {
    int result = paymentService.create(payment);
    log.info("******插入结果:" + result);
    if (result > 0) {
      return new CommentResult(200, "插入数据库成功", result);
    } else {
      return new CommentResult(444, "插入数据库失败", null);
    }
  }

  @GetMapping("/get/{id}")
  public CommentResult get(@PathVariable("id") Long id) {
    Payment payment = paymentService.getById(id);
    log.info("******查询结果:" + payment);
    if (payment != null) {
      return new CommentResult(200, "查询成功", payment);
    } else {
      return new CommentResult(444, "没有对应记录,查询id:" + id, null);
    }
  }
}
