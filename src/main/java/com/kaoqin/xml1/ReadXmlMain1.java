package com.kaoqin.xml1;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @program: QRCode
 * @description: xml文档读取
 * @author: Luke.noer
 * @create: 2020-12-09 23:27
 **/
public class ReadXmlMain1 {

    public static void main(String[] args) throws Exception {
        List<RecordEntity1> recordEntity1List = listCity();
        for (RecordEntity1 r:recordEntity1List
             ) {
            r.setUri("你处理结果");
        }
        System.out.println(recordEntity1List.toString());
    }

    public static List<RecordEntity1> listCity() throws Exception {
        // 1.读取xml文件
        InputStream resourceAsStream = ReadXmlMain1.class.getResourceAsStream("/public/test.xml");
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
                .replace("from_unixtime((b.create_time)/1000)", "create_time")
                .replace("from_unixtime((b.modify_time)/1000)", "modify_time");
        Object toBean = XsteamUtil.toBean(RecordsEntity1.class, buf);
        return ((RecordsEntity1) toBean).getRecordsList();
    }

}
