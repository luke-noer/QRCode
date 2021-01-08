package com.kaoqin.controller;

import com.kaoqin.commen.R;
import com.kaoqin.excel.DemoEntity;
import com.kaoqin.excel.ExcelUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-07 17:18
 **/
@RequestMapping("/file")
@RestController
public class ExcelFileController {

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    public R upload(MultipartFile file) {
        Map map = ExcelUtils.readExcel(DemoEntity.class, file, 0, 1);
        return new R(200, true, map.get("errorMessages"));
    }


}