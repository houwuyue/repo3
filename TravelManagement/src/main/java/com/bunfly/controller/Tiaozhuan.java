package com.bunfly.controller;

import com.bunfly.Util.Test;
import com.bunfly.bean.Ts_middle;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("servlet.mvc")
public class Tiaozhuan {
    @RequestMapping("updateData.mvc")
    public String tiaozhuan(@RequestParam("ts_middle_pk") Integer ts_middle_pk){
        Test.ts_middle_pk = ts_middle_pk;
        return "/TouristInformation.html";
    }

}
