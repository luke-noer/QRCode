package com.kaoqin.excel;

import com.kaoqin.excel.validate.ReplaceDef;
import com.kaoqin.excel.validate.ValidateDef;
import com.kaoqin.excel.validate.ValidateMoney;
import lombok.Data;

import java.util.Date;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-04 10:05
 **/
@Data
public class DemoEntity {

    @ExcelColumn(value = "用户名")
    @ValidateMould(execute = ValidateDef.class)
    String user;

    @ExcelColumn(value = "年龄")
    @ValidateMould(execute = ValidateDef.class)
    Integer age;

    @ExcelColumn(value = "金额")
    @ValidateMould(execute = ValidateMoney.class)
    Double sale;

    @ExcelColumn(value = "是学生")
    @ReplaceMould(execute = ReplaceDef.class)
    Boolean isStudent;

    @ExcelColumn(value = "开始日期")
    Date start;

}
