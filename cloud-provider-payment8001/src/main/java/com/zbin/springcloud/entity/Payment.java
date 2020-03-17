package com.zbin.springcloud.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.zbin.springcloud.entity.Payment
 *
 * @author Zbin
 * @date 2020/03/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

  private Long id;

  private String serial;
}
