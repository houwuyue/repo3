package com.bunfly.dao;

import com.bunfly.bean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface GetUser {
    public List<Doctor> all();

    public Account selectUserData(@Param("user") String user, @Param("password") String password);

    public Travel_agency selectAll(Integer travel_agency_pk);

    public Boolean upDataCount(Integer travel_agency_pk);

    public Boolean upDataDate(@Param("travel_agency_pk") Integer travel_agency_pk,@Param("last_time") String last_time);

    public String selectDate(Integer travel_agency_pk);

    public List<Ts_middle> selectAllInfo();//@Param("page") Integer page,@Param("size") Integer size

    public Integer getAllCount();

    public  List<Ts_middle>selectInfo(String val);

    public Ts_middle selectCount(Integer ts_middle_pk);

    public Integer InsertData(Tourist tourist);


}
