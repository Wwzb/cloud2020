package com.zbin.springcloud.service.impl;

import com.zbin.springcloud.dao.PaymentDao;
import com.zbin.springcloud.entities.Payment;
import com.zbin.springcloud.service.PaymentService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * com.zbin.springcloud.service.impl.PaymentServiceImpl
 *
 * @author Zbin
 * @date 2020/03/26
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  @Override
  public Payment get(Long id) {
    return paymentDao.getById(id);
  }

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }
}
