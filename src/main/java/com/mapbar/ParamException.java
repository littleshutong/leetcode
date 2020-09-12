package com.mapbar;

import java.util.concurrent.ExecutorService;

public class ParamException extends Exception {
    public ParamException() {
    }
    /**
     * 构造器，向上传递错误信息
     */
    public ParamException(String info) {
        super(info);
    }
}
