package com.bunfly.controller;

import com.bunfly.bean.Account;
import com.bunfly.Util.Test;

import com.bunfly.bean.Travel_agency;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/login.mvc")
public class LoginServlet {
    @RequestMapping(value = "/loginmethod.mvc")

    public void doPost(@RequestParam("user") String user,@RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser getUser = con.getBean(GetUser.class);
        Account account = getUser.selectUserData(user,password);
//        Travel_agency travel_agency = new Travel_agency();
        Test test = con.getBean(Test.class);
        if (account ==null){
            response.sendRedirect("/TravelManagement_war/login.html");
        }else {
            Test.travel_agency_pk = account.getTravel_agency_pk();
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = dateFormat.format(date);
            Test.last_time = time;
            request.getRequestDispatcher("/home.html").forward(request,response);
        }


    }

}
