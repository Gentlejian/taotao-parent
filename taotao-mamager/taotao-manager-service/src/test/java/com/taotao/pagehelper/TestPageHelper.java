package com.taotao.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author zhangjianfeng35
 * @data 2021-01-18 - 14:18
 */

public class TestPageHelper {
    @Test
    public void testPageHelper() throws Exception {
        //1. 在mybatis的配置文件中配置分页插件
        //2. 在执行查询之前配置分页条件，使用pageHelper的静态方法
        PageHelper.startPage(1,10);
        //3. 执行查询
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-dao.xml");
        TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
        //创建 Example 对象
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //4. 获取分页信息，使用PageInfo对象
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
        System.out.println("查询总记录数：" + pageInfo.getTotal());
        System.out.println("查询总记页数：" + pageInfo.getPages());
        System.out.println("返回总记录数：" + pageInfo.getPageSize());
    }

}
