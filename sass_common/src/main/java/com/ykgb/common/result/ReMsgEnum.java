package com.ykgb.common.result;
/**
 * Enum ReMsgEnum ...
 * Re 返回参数.
 * @author youxuepai
 * Created on 2019/8/26
 */
public enum ReMsgEnum {
  /**
   * taskId is null
   */
  TASKID_ISNULL("taskId为必填项！"),
  PROCESSINSTANTID_ISNULL("processInstanceId为必填项！"),
  LURK_QUESTION_QUERY_FAIL("埋错数据查询失败！"),
  ACTIONCODE_ISNULL("actionCode为必填项！"),
  AUDIT_NUM_ISNULL("auditNum为必填项！"),
  PAPERID_ISNULL("paperId为必填项！"),
  QUESTIONID_ISNULL("questionId为必填项！"),
  REPORT_ERROR_FAIL("报错信息为空！"),
  QUESTION_NOTFOUND_ERRTYPE("有报错项未选择错误类型！"),
  ERRORTYPE_ISNULL("errorType为必填项！");

  private String reMsg;

  ReMsgEnum(String msg) {
    this.reMsg = msg;
  }

  public String getReMsg() {
    return reMsg;
  }
}
