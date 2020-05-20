package com.bunfly.controller;

import com.bunfly.bean.Ts_middle;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/servlet.mvc")
public class SelectDetails {
    @RequestMapping("/selectDetails.mvc")
    @ResponseBody
    public List<Ts_middle> selectDetails(@RequestParam("details") String details){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        List<Ts_middle> list = getUser.selectInfo(details);
        System.out.println(details);
        return list;
    }

}
