package com.kaoqin.excel.entity;

import lombok.Data;

/**
 * @program: printing_external
 * @description:
 * @author: Luke.noer
 * @create: 2020-10-27 18:43
 **/
@Data
public class ExcelErrorMessage {

    private Integer rowNum;

    private Integer cellNum;

    private String cellName;

    private String value;

    private String errorMessage;

    public ExcelErrorMessage(Integer rowNum, Integer cellNum, String cellName, String value, String errorMessage) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.cellName = cellName;
        this.value = value;
        this.errorMessage = errorMessage;
    }
}
