package com.kaoqin.xml;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * @program: QRCode
 * @description: 工具类，把xml文件中的数据读取出来，然后转换为Object
 * @author: Luke.noer
 * @create: 2020-12-09 23:26
 **/
public class XmlBuilder {

    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception {
        Object obj = null;
        //1.读取xml文件
        Reader reader = null;
        //jaxb API
        //上下文
        JAXBContext context = JAXBContext.newInstance(clazz);
        //调用xml转换成对象的接口
        Unmarshaller un = context.createUnmarshaller();
        //实例化Reader
        reader = new StringReader(xmlStr);
        /*
         * 核心代码：把xml字符串转换成java Object
         * 2.把xml字符串转换为java Object：整个文件是一个字符串--》CityList
         */
        obj = un.unmarshal(reader);
        if (null != reader) {
            reader.close();
        }
        return obj;
    }

}
