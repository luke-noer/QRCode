package com.kaoqin.xml1;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: QRCode
 * @description:
 * @author: Luke.noer
 * @create: 2020-12-09 23:24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("RECORDS")
public class RecordsEntity1 {

    @XStreamImplicit(itemFieldName="RECORD")
    private List<RecordEntity1> recordsList;
}
