package com.zbin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.zbin.springcloud.entities.CommonResult
 *
 * @author Zbin
 * @date 2020/03/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }
}
