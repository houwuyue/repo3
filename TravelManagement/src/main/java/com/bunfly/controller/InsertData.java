package com.bunfly.controller;

import com.bunfly.Util.Test;
import com.bunfly.bean.Tourist;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("servlet1.mvc")
public class InsertData {
    @RequestMapping("InsertData.mvc")
    @ResponseBody
    public void insert(Tourist tourist){
        System.out.println(tourist);
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        tourist.setTs_middle_pk(Test.ts_middle_pk);
        System.out.println(tourist.toString()+"11111111");
        getUser.InsertData(tourist);
    }

}
