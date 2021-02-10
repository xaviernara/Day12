package com.example.myapplication.model;

import com.squareup.moshi.Json;

public class Name {

    @Json(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
