package com.kaoqin.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-09 23:24
 **/
@XmlRootElement(name = "RECORDS")//RecordEntity映射xml文件中的RECORD节点
@XmlAccessorType(XmlAccessType.FIELD)//访问每一个属性
public class RecordsEntity {

    @XmlElement(name="RECORD")
    private List<RecordEntity> recordsList;

    public List<RecordEntity> getRecordsList() {
        return recordsList;
    }

    public void setRecordsList(List<RecordEntity> recordsList) {
        this.recordsList = recordsList;
    }
}
