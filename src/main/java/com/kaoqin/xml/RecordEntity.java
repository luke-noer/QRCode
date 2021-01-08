package com.kaoqin.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-09 23:18
 **/
@XmlRootElement(name = "RECORD")//RecordEntity映射xml文件中的RECORD节点
@XmlAccessorType(XmlAccessType.FIELD)//访问每一个属性
public class RecordEntity {

    /**
     * java类与xml文件的映射不用名字相同
     */
    @XmlAttribute(name = "title")
    private String title;
    @XmlAttribute(name = "content")
    private String content;
    @XmlAttribute(name = "create_time")
    private String create_time;
    @XmlAttribute(name = "modify_time")
    private String modify_time;
    @XmlAttribute(name = "author")
    private String author;
    @XmlAttribute(name = "remarks")
    private String remarks;
    @XmlAttribute(name = "cover_url")
    private String cover_url;
    @XmlAttribute(name = "url")
    private String url;
    @XmlAttribute(name = "url_prefix")
    private String url_prefix;
    @XmlAttribute(name = "_id")
    private String _id;
    @XmlAttribute(name = "material_id")
    private String material_id;
    @XmlAttribute(name = "external_open")
    private String external_open;

}
