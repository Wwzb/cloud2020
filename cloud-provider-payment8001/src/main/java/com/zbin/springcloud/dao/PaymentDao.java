package com.zbin.springcloud.dao;

import com.zbin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * com.zbin.springcloud.dao.PaymentDao
 *
 * @author Zbin
 * @date 2020/03/16
 */
@Mapper
public interface PaymentDao {

  int create(Payment payment);

  Payment getById(@Param("id") Long id);
}
