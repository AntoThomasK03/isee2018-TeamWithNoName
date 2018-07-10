package com.example.laxman.timetracker;

public class Model {
    private int id;
    private String name;
    private String category;
    private String date;
    private String stime;
    private String etime;

    public Model (int id, String name, String category, String date, String stime, String etime){
        this.id= id;
        this.name = name;
        this.category = category;
        this.date = date;
        this.stime = stime;
        this.etime = etime;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }
}
