package com.bunfly.controller;

import com.bunfly.Util.Test;
import com.bunfly.bean.Travel_agency;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("servlet1.mvc")
public class GetUserData {

    @RequestMapping("getdata.mvc")
    @ResponseBody
    public Travel_agency doPost(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        Travel_agency travel_agency = getUser.selectAll(Test.travel_agency_pk);
        Boolean aBoolean = getUser.upDataCount(Test.travel_agency_pk);
        aBoolean = true;
        Boolean aBoolean1 = getUser.upDataDate(Test.travel_agency_pk, Test.last_time);
        aBoolean1 = true;
        return travel_agency;


    }

}
