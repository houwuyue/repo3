package com.bunfly.controller;

import com.bunfly.Util.Test;
import com.bunfly.bean.Ts_middle;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("servlet.mvc")
public class SelectDate {
    @RequestMapping("updateData1.mvc")
    @ResponseBody
    public Ts_middle SelectData(Integer ts_middle_pk){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        Ts_middle ts_middle = getUser.selectCount(Test.ts_middle_pk);
        System.out.println(Test.ts_middle_pk);
        return ts_middle;

    }
}
