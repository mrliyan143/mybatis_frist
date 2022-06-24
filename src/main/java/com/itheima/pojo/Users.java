package com.itheima.pojo;

public class Users {
    private int uid;
    private String uname;
    private int uage;


//    public  Users(String name ,int age,int id){
//        this.uname = name;
//        this.uage = age;
//        this.uid = id;
//    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", uid=" + uid +
                ", uage=" + uage +
                '}';
    }
}
