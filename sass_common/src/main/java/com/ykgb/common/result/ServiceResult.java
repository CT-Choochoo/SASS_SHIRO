package com.ykgb.common.result;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class ServiceResult<T> {

  private Integer code;
  private String msg;
  private T data;

  private ServiceResult(T data) {
    this.data = data;
  }

  private ServiceResult(Integer code, T data) {
    this.data = data;
    this.code = code;
  }

  private ServiceResult(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  private ServiceResult(Integer code) {
    this.code = code;
  }

  private ServiceResult(CodeMsg codeMsg) {
    if (codeMsg != null) {
      this.code = codeMsg.getCode();
      this.msg = codeMsg.getMsg();
    }
  }
  private ServiceResult(CodeMsg codeMsg ,T data) {
    if (codeMsg != null) {
      this.code = codeMsg.getCode();
      this.msg = codeMsg.getMsg();
    }
    this.data = data;
  }

  private ServiceResult(Integer code, String msg, T data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success() {
    return new ServiceResult<>(CodeMsg.SUCCESS);
  }
  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(Integer code) {
    return new ServiceResult<>(code);
  }

  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(T data) {
    return new ServiceResult<>(CodeMsg.SUCCESS,data);
  }
  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(CodeMsg codeMsg) {
    return new ServiceResult<>(codeMsg);
  }
  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(CodeMsg codeMsg,String msg) {
    return new ServiceResult<>(codeMsg.getCode(),msg);
  }
  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(CodeMsg codeMsg,String msg,T data) {
    return new ServiceResult<>(codeMsg.getCode(),msg ,data);
  }
  /**
   * 成功时候的调用
   */
  public static <T> ServiceResult<T> success(Integer code, T data) {
    return new ServiceResult<>(code, data);
  }

  /**
   * 失败时候的调用
   */
  public static <T> ServiceResult<T> error(CodeMsg codeMsg) {
    return new ServiceResult<>(codeMsg);
  }
  /**
   * 失败时候的调用
   */
  public static <T> ServiceResult<T> error(CodeMsg codeMsg,boolean isRollback) {
    if (isRollback){
      TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }
    return new ServiceResult<>(codeMsg);
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
