package com.bunfly.bean;

public class Scenic_spot {
    private int scenic_spot_pk;
    private String title;
    private String content;
    private String country;
    private String address;
    private double price;
    private String company;

    public int getScenic_spot_pk() {
        return scenic_spot_pk;
    }

    public void setScenic_spot_pk(int scenic_spot_pk) {
        this.scenic_spot_pk = scenic_spot_pk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Scenic_spot{" +
                "scenic_spot_pk=" + scenic_spot_pk +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
