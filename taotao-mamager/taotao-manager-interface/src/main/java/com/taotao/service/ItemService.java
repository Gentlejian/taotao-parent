package com.taotao.service;

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
     * @param itemId
     * @return
     */
    TbItem getItemById(long itemId);

}
