package com.bunfly.bean;

public class Travel_agency {
    private int travel_agency_pk;
    private String name;
    private String address;
    private String phone;
    private String create_time;
    private String postdve_time;
    private int login_count;
    private String last_time;

    public int getTravel_agency_pk() {
        return travel_agency_pk;
    }

    public void setTravel_agency_pk(int travel_agency_pk) {
        this.travel_agency_pk = travel_agency_pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getPostdve_time() {
        return postdve_time;
    }

    public void setPostdve_time(String postdve_time) {
        this.postdve_time = postdve_time;
    }

    public int getLogin_count() {
        return login_count;
    }

    public void setLogin_count(int login_count) {
        this.login_count = login_count;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    @Override
    public String toString() {
        return "Travel_agency{" +
                "travel_agency_pk=" + travel_agency_pk +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", create_time='" + create_time + '\'' +
                ", postdve_time='" + postdve_time + '\'' +
                ", login_count=" + login_count +
                ", last_time='" + last_time + '\'' +
                '}';
    }
}
