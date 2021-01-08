package com.kaoqin.excel.entity;

import lombok.Data;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-07 17:12
 **/
@Data
public class ReplaceMessage {
    private String innerValue;
    private String outerValue;
    private boolean status;
    private String message;

    public ReplaceMessage(String innerValue, String outerValue, boolean status, String message) {
        this.innerValue = innerValue;
        this.outerValue = outerValue;
        this.status = status;
        this.message = message;
    }
}
