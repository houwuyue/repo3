package com.bunfly.bean;

public class Account {
    private int account_id;
    private int travel_agency_pk;
    private  String user;
    private String password;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getTravel_agency_pk() {
        return travel_agency_pk;
    }

    public void setTravel_agency_pk(int travel_agency_pk) {
        this.travel_agency_pk = travel_agency_pk;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", travel_agency_pk=" + travel_agency_pk +
                ", user=" + user +
                ", password=" + password +
                '}';
    }
}
