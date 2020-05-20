package com.bunfly.bean;

public class Tourist {
    private int tourist_pk;
    private String name1;
    private String sex;
    private String car_type;
    private String birthday;
    private String identity_card;
    private String phone;
    private String type;
    private String remarks;
    private Integer ts_middle_pk;

    public int getTourist_pk() {
        return tourist_pk;
    }

    public void setTourist_pk(int tourist_pk) {
        this.tourist_pk = tourist_pk;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getTs_middle_pk() {
        return ts_middle_pk;
    }

    public void setTs_middle_pk(Integer ts_middle_pk) {
        this.ts_middle_pk = ts_middle_pk;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "tourist_pk=" + tourist_pk +
                ", name1='" + name1 + '\'' +
                ", sex='" + sex + '\'' +
                ", car_type='" + car_type + '\'' +
                ", birthday='" + birthday + '\'' +
                ", identity_card='" + identity_card + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", remarks='" + remarks + '\'' +
                ", ts_middle_pk=" + ts_middle_pk +
                '}';
    }
}