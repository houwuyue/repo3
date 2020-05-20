package com.bunfly.bean;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    private int keshi_id;
    private int doctor_id;
    private String doctor_name;
    private String title;
    private  double guahaofee;
    @Override
    public String toString() {
        return "Doctor{" +
                "keshi_id=" + keshi_id +
                ", doctor_id=" + doctor_id +
                ", doctor_name='" + doctor_name + '\'' +
                ", title='" + title + '\'' +
                ", guahaofee=" + guahaofee +
                '}';
    }

    public int getKeshi_id() {
        return keshi_id;
    }

    public void setKeshi_id(int keshi_id) {
        this.keshi_id = keshi_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getGuahaofee() {
        return guahaofee;
    }

    public void setGuahaofee(double guahaofee) {
        this.guahaofee = guahaofee;
    }
}
