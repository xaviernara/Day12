package com.example.myapplication.model;

import com.squareup.moshi.Json;

public class Language {

    @Json(name = "iso639_1")
    private String iso6391;

    @Json(name = "iso639_2")
    private String iso6392;

    @Json(name = "name")
    private String name;

    @Json(name = "nativeName")
    private String nativeName;

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }
}
