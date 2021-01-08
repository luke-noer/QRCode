package com.kaoqin.excel.validate;

import com.kaoqin.excel.entity.ValidateMessage;
import org.apache.commons.lang3.StringUtils;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-04 10:12
 **/
public class ValidateDef {

    private static String IS_NOT_NULL = "必填项,不能为空!";

    public ValidateMessage validate(String inner){
        if(StringUtils.isBlank(inner)){
            return new ValidateMessage(inner,false,IS_NOT_NULL);
        }else {
            return new ValidateMessage(inner,true,null);
        }

    }

}
