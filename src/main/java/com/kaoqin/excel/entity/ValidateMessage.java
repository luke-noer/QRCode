package com.kaoqin.excel.entity;

import lombok.Data;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-07 17:11
 **/
@Data
public class ValidateMessage {
    private String innerValue;
    private boolean status;
    private String message;

    public ValidateMessage(String innerValue, boolean status, String message) {
        this.innerValue = innerValue;
        this.status = status;
        this.message = message;
    }
}
