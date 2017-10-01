package com.example.somto.mvcdemo;

/**
 * Created by somto on 8/28/2017.
 */

public class StudentModel
{
    private int userId;
    private String userName;

    public StudentModel(int userId, String userName )
    {
        this.userId=userId;
        this.userName=userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
