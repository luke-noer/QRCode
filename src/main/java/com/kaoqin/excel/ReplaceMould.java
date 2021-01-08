package com.kaoqin.excel;

import com.kaoqin.excel.validate.ReplaceDef;
import com.kaoqin.excel.validate.ValidateDef;

import java.lang.annotation.*;

/**
 * @program: printing_external
 * @description:
 * @author: Luke.noer
 * @create: 2020-10-21 10:26
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReplaceMould {

    Class execute() default ReplaceDef.class;

}