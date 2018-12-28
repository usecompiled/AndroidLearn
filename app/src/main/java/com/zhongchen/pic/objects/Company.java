package com.zhongchen.pic.objects;

public class Company {

    private String name;
    private int imageid;



    public Company(String name,int imageid){
        this.name = name;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public int getImageid() {
        return imageid;
    }
}