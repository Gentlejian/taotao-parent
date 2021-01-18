package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangjianfeng35
 * @data 2021-01-18 - 10:00
 *
 * 页面展示Controller
 */
@Controller
public class PageController {


    /**
     * 后台管理展示
     * @return
     */
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }


    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
