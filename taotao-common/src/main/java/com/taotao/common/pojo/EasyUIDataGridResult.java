package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangjianfeng35
 * @data 2021-01-18 - 11:32
 *
 * EasyUI 网络数据传输
 */
public class EasyUIDataGridResult implements Serializable {

    /** 总记录数 */
    private long total;
    /** 数据集 */
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
