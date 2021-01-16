package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * 商品管理Controller
 * @author zhangjianfeng35
 * @data 2021-01-14 - 10:38
 */
@Controller
public class ItemController {

    /** 将itemService接口注入*/
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        System.out.println(itemId);
        System.out.println(itemService);
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

}
