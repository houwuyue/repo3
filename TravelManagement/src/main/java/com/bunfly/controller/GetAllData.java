package com.bunfly.controller;

import com.bunfly.bean.Ts_middle;
import com.bunfly.dao.GetUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/servlet.mvc")
public class GetAllData {

    @RequestMapping("getTeamCityCount.mvc")
    @ResponseBody
    public Map<String, Object> getAllCount(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        Integer getUserAllCount = getUser.getAllCount();

        Map<String,Object> map = new HashMap<>();
        map.put("countTeam",getUserAllCount);
        return map;
    }
    @RequestMapping("getTeamCity.mvc")
    @ResponseBody
    public Map<String, Object> getPagingdata(@RequestParam("PageNumber") int PageNumber){
        Map<String,Object> map = new HashMap<>();

        map.put("countTeam",PageNumber);
        return map;
    }


}
