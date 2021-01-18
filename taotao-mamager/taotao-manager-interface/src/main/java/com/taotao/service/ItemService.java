package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * @author zhangjianfeng35
 * @data 2021-01-14 - 09:58
 *
 * 根据商品id查询商品信息
 */
public interface ItemService {

    /**
     * 根据商品id查询商品信息
     * @param itemId 商品id号
     * @return
     */
    TbItem getItemById(long itemId);

    /**
     * 查询商品信息总记录
     * @param page 总记录数
     * @param rows 数据集
     * @return
     */
    EasyUIDataGridResult getItemList(int page, int rows);

}
