package com.ykgb.common.result;

public class CodeMsg {

    private int code;
    private String msg;
    /**
     * 操作成功
     */
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    /**
     * 修改失败
     */
    public static CodeMsg UPDATE_FAIL = new CodeMsg(1001, "数据更新失败！");



    private CodeMsg() {

    }

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 返回带参数的错误码
     * @param args
     * @return
     */
    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    @Override
    public String toString() {
        return "CodeMsg [code=" + code + ", msg=" + msg + "]";
    }


}
