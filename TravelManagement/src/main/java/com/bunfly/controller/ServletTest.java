package com.bunfly.controller;

import com.bunfly.bean.Doctor;
import com.bunfly.dao.GetUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/servlet.mvc")
public class ServletTest {


    @RequestMapping("/get_data.mvc")
    @ResponseBody
    public Object doPost(String name){
        System.out.println(name);
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUser bean = con.getBean(GetUser.class);
        List<Doctor> doctor1 = bean.all();

        for (Doctor doctor : doctor1) {
            System.out.println(doctor.toString());
        }
        return doctor1;
    }

}
