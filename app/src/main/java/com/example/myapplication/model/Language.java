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


}
