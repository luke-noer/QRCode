package com.kaoqin.xml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-09 23:27
 **/
public class ReadXmlMain {

    public static void main(String[] args) throws Exception {
        List<RecordEntity> recordEntities = listCity();
        System.out.println(recordEntities.toString());
    }

    public static List<RecordEntity> listCity() throws Exception {
        // 1.读取xml文件
        InputStream resourceAsStream = ReadXmlMain.class.getResourceAsStream("/public/test.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resourceAsStream));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        //2.把xml文件内容读入缓冲区
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        br.close();
        //3.调用xml转换Object工具类的方法获取所有城市数据
        String buf = buffer.toString()
                .replace("from_unixtime((b.create_time)/1000)","create_time")
                .replace("from_unixtime((b.modify_time)/1000)","modify_time");
        RecordsEntity recordsEntity = (RecordsEntity) XmlBuilder.xmlStrToObject(RecordsEntity.class, buf);
        return recordsEntity.getRecordsList();
    }

}
