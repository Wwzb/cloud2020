package com.zbin.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.zbin.springcloud.entity.CommentResult
 *
 * @author Zbin
 * @date 2020/03/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResult<T> {

  private Integer code;

  private String message;

  private T data;

  public CommentResult(Integer code, String message) {
    this(code, message, null);
  }
}
