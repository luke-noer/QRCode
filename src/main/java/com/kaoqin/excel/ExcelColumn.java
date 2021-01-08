package com.kaoqin.excel;


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
public @interface ExcelColumn {
    /**
     * Excel标题
     *
     * @return
     * @author Lynch
     */
    String value() default "";

    /**
     * Excel从左往右排列位置
     *
     * @return
     * @author Lynch
     */
    int col() default 0;

}