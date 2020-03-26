package com.zbin.springcloud.service;

import com.zbin.springcloud.entities.Payment;

/**
 * com.zbin.springcloud.service.PaymentService
 *
 * @author Zbin
 * @date 2020/03/26
 */

public interface PaymentService {

  Payment get(Long id);

  int create(Payment payment);
}
