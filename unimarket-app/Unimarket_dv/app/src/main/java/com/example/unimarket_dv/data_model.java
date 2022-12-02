package com.example.unimarket_dv;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class data_model {
    @SerializedName("userId")
    @Expose
    private String userId;


    public String getUserId(){
        return userId;
    }


}