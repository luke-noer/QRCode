package com.kaoqin.xml1;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("RECORD")
public class RecordEntity1 {

    /**
     * java类与xml文件的映射不用名字相同
     */
    @XStreamAsAttribute
    @XStreamAlias("title")
    private String title;

    @XStreamAsAttribute
    @XStreamAlias("content")
    private String content;

    @XStreamAsAttribute
    @XStreamAlias("create_time")
    private String create_time;

    @XStreamAsAttribute
    @XStreamAlias("modify_time")
    private String modify_time;

    @XStreamAsAttribute
    @XStreamAlias("author")
    private String author;

    @XStreamAsAttribute
    @XStreamAlias("remarks")
    private String remarks;

    @XStreamAsAttribute
    @XStreamAlias("cover_url")
    private String cover_url;

    @XStreamAsAttribute
    @XStreamAlias("url")
    private String url;

    @XStreamAsAttribute
    @XStreamAlias("url_prefix")
    private String url_prefix;

    @XStreamAsAttribute
    @XStreamAlias("_id")
    private String _id;

    @XStreamAsAttribute
    @XStreamAlias("material_id")
    private String material_id;

    @XStreamAsAttribute
    @XStreamAlias("external_open")
    private String external_open;

    private String uri;

}
