package com.kaoqin.excel.validate;

import com.kaoqin.excel.entity.ReplaceMessage;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2021-01-04 10:12
 **/
public class ReplaceDef {

    private static String BOOLEAN_FALSE = "false";
    private static String BOOLEAN_TRUE = "true";
    private static String IS_ILLEGAL = "输入非法值,期望值为:";

    public ReplaceMessage replace(String inner){
        if(BOOLEAN_FALSE.equals(inner)){
            return new ReplaceMessage(inner,"0",true,null);
        }
        if(BOOLEAN_TRUE.equals(inner)){
            return new ReplaceMessage(inner,"1",true,null);
        }
        return new ReplaceMessage(inner,null,false,IS_ILLEGAL+"true/false");
    }

}
