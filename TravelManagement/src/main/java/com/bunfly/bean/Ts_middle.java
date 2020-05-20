package com.bunfly.bean;

public class Ts_middle {
    //景点和旅行社生成线路表

    private int ts_middle_pk;
    private int travel_agency_pk;
    private int scenic_spor_pk;
    private double price;
    private int count;
    private String depart_time;
    private String over_time;
    private String details;

    public int getTs_middle_pk() {
        return ts_middle_pk;
    }

    public void setTs_middle_pk(int ts_middle_pk) {
        this.ts_middle_pk = ts_middle_pk;
    }

    public int getTravel_agency_pk() {
        return travel_agency_pk;
    }

    public void setTravel_agency_pk(int travel_agency_pk) {
        this.travel_agency_pk = travel_agency_pk;
    }

    public int getScenic_spor_pk() {
        return scenic_spor_pk;
    }

    public void setScenic_spor_pk(int scenic_spor_pk) {
        this.scenic_spor_pk = scenic_spor_pk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDepart_time() {
        return depart_time;
    }

    public void setDepart_time(String depart_time) {
        this.depart_time = depart_time;
    }

    public String getOver_time() {
        return over_time;
    }

    public void setOver_time(String over_time) {
        this.over_time = over_time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Ts_middle{" +
                "ts_middle_pk=" + ts_middle_pk +
                ", travel_agency_pk=" + travel_agency_pk +
                ", scenic_spor_pk=" + scenic_spor_pk +
                ", price=" + price +
                ", count=" + count +
                ", depart_time='" + depart_time + '\'' +
                ", over_time='" + over_time + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
