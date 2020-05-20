package com.bunfly.controller;

import com.bunfly.bean.Ts_middle;
import com.bunfly.dao.GetUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestHandler {


    @RequestMapping("Test.mvc")
    @ResponseBody
    public com.bunfly.bean.Page test(@RequestParam("pageNumber") Integer pageNumber) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser bean = con.getBean(GetUser.class);
        Page<Object> objects = PageHelper.startPage(pageNumber, 2);
        com.bunfly.bean.Page page = new com.bunfly.bean.Page();
        List<Ts_middle> list = bean.selectAllInfo();
        page.setTatil(objects.getTotal());
        page.setRows(list);
        return page;
    }
}
