package com.kaoqin.controller;

import com.google.zxing.Result;
import com.kaoqin.utils.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-07 17:18
 **/
@RequestMapping("/Qrcode")
@RestController
public class QrcodeController {

    /**
     * 生成二维码
     */
    @RequestMapping
    public String produceCode(@RequestBody Map<String,String> param) {
        return QRCodeUtil.zxingCodeCreate(param.get("content").substring(0,255), "E:/code_tmp/",500,null);
    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public String analyseCode(String fileName) {
        Result result = QRCodeUtil.zxingCodeAnalyze("E:/code_tmp/"+fileName+".jpg");
        System.err.println("二维码解析内容："+result.toString());
        return result.toString();
    }

}