package com.kaoqin.xml1;

import com.thoughtworks.xstream.XStream;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-10 00:26
 **/
public class XsteamUtil {
    public static Object toBean(Class<?> clazz, String xml) {
        Object xmlObject = null;
        XStream xstream = new XStream();
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(new Class[]{ReadXmlMain1.class, RecordsEntity1.class, RecordEntity1.class});
        xstream.processAnnotations(clazz);
        xstream.autodetectAnnotations(true);
        xmlObject = xstream.fromXML(xml);
        return xmlObject;
    }
}
