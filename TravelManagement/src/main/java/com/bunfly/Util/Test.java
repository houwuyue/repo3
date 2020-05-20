package com.bunfly.Util;

import org.springframework.stereotype.Component;

@Component
public class Test {
    public static int travel_agency_pk;
    public static String last_time;
    public static Integer ts_middle_pk;

    public static int getTravel_agency_pk() {
        return travel_agency_pk;
    }

    public static void setTravel_agency_pk(int travel_agency_pk) {
        Test.travel_agency_pk = travel_agency_pk;
    }

    public static String getLast_time() {
        return last_time;
    }

    public static void setLast_time(String last_time) {
        Test.last_time = last_time;
    }

    public static int getTs_middle_pk() {
        return ts_middle_pk;
    }

    public static void setTs_middle_pk(int ts_middle_pk) {
        Test.ts_middle_pk = ts_middle_pk;
    }
}
