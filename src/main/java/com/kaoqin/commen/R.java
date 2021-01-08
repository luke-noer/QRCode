package com.kaoqin.commen;

import lombok.Data;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-08 11:00
 **/
@Data
public class R {
    private int code;
    private boolean status;
    private Object data;

    public R(int code, boolean status, Object data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }
}
