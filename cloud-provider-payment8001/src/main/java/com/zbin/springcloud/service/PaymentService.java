package com.zbin.springcloud.service;

import com.zbin.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * com.zbin.springcloud.service.PaymentService
 *
 * @author Zbin
 * @date 2020/03/16
 */

public interface PaymentService {

  int create(Payment payment);

  Payment getById(@Param("id") Long id);
}
