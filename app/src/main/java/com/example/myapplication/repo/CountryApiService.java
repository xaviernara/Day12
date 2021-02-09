package com.example.myapplication.repo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface CountryApiService {

    /*
        [
    {
        "name": "Ukraine",
        "topLevelDomain": [
            ".ua"
        ],
        "alpha2Code": "UA",
        "alpha3Code": "UKR",
        "callingCodes": [
            "380"
        ],
        "capital": "Kiev",
        "altSpellings": [
            "UA",
            "Ukrayina"
        ],
        "region": "Europe",
        "subregion": "Eastern Europe",
        "population": 42692393,
        "latlng": [
            49.0,
            32.0
        ],
        "demonym": "Ukrainian",
        "area": 603700.0,
        "gini": 26.4,
        "timezones": [
            "UTC+02:00"
        ],
        "borders": [
            "BLR",
            "HUN",
            "MDA",
            "POL",
            "ROU",
            "RUS",
            "SVK"
        ],
        "nativeName": "Україна",
        "numericCode": "804",
        "currencies": [
            {
                "code": "UAH",
                "name": "Ukrainian hryvnia",
                "symbol": "₴"
            }
        ],
        "languages": [
            {
                "iso639_1": "uk",
                "iso639_2": "ukr",
                "name": "Ukrainian",
                "nativeName": "Українська"
            }
        ],
        "translations": {
            "de": "Ukraine",
            "es": "Ucrania",
            "fr": "Ukraine",
            "ja": "ウクライナ",
            "it": "Ucraina",
            "br": "Ucrânia",
            "pt": "Ucrânia",
            "nl": "Oekraïne",
            "hr": "Ukrajina",
            "fa": "وکراین"
        },
        "flag": "https://restcountries.eu/data/ukr.svg",
        "regionalBlocs": [],
        "cioc": "UKR"
    },
    {
        "name": "Cook Islands",
        "topLevelDomain": [
            ".ck"
        ],
        "alpha2Code": "CK",
        "alpha3Code": "COK",
        "callingCodes": [
            "682"
        ],
        "capital": "Avarua",
        "altSpellings": [
            "CK",
            "Kūki 'Āirani"
        ],
        "region": "Oceania",
        "subregion": "Polynesia",
        "population": 18100,
        "latlng": [
            -21.23333333,
            -159.76666666
        ],
        "demonym": "Cook Islander",
        "area": 236.0,
        "gini": null,
        "timezones": [
            "UTC-10:00"
        ],
        "borders": [],
        "nativeName": "Cook Islands",
        "numericCode": "184",
        "currencies": [
            {
                "code": "NZD",
                "name": "New Zealand dollar",
                "symbol": "$"
            },
            {
                "code": "CKD",
                "name": "Cook Islands dollar",
                "symbol": "$"
            }
        ],
        "languages": [
            {
                "iso639_1": "en",
                "iso639_2": "eng",
                "name": "English",
                "nativeName": "English"
            }
        ],
        "translations": {
            "de": "Cookinseln",
            "es": "Islas Cook",
            "fr": "Îles Cook",
            "ja": "クック諸島",
            "it": "Isole Cook",
            "br": "Ilhas Cook",
            "pt": "Ilhas Cook",
            "nl": "Cookeilanden",
            "hr": "Cookovo Otočje",
            "fa": "جزایر کوک"
        },
        "flag": "https://restcountries.eu/data/cok.svg",
        "regionalBlocs": [],
        "cioc": "COK"
    },
    {
        "name": "Korea (Democratic People's Republic of)",
        "topLevelDomain": [
            ".kp"
        ],
        "alpha2Code": "KP",
        "alpha3Code": "PRK",
        "callingCodes": [
            "850"
        ],
        "capital": "Pyongyang",
        "altSpellings": [
            "KP",
            "Democratic People's Republic of Korea",
            "조선민주주의인민공화국",
            "Chosŏn Minjujuŭi Inmin Konghwaguk"
        ],
        "region": "Asia",
        "subregion": "Eastern Asia",
        "population": 25281000,
        "latlng": [
            40.0,
            127.0
        ],
        "demonym": "North Korean",
        "area": 120538.0,
        "gini": null,
        "timezones": [
            "UTC+09:00"
        ],
        "borders": [
            "CHN",
            "KOR",
            "RUS"
        ],
        "nativeName": "북한",
        "numericCode": "408",
        "currencies": [
            {
                "code": "KPW",
                "name": "North Korean won",
                "symbol": "₩"
            }
        ],
        "languages": [
            {
                "iso639_1": "ko",
                "iso639_2": "kor",
                "name": "Korean",
                "nativeName": "한국어"
            }
        ],
        "translations": {
            "de": "Nordkorea",
            "es": "Corea del Norte",
            "fr": "Corée du Nord",
            "ja": "朝鮮民主主義人民共和国",
            "it": "Corea del Nord",
            "br": "Coreia do Norte",
            "pt": "Coreia do Norte",
            "nl": "Noord-Korea",
            "hr": "Sjeverna Koreja",
            "fa": "کره جنوبی"
        },
        "flag": "https://restcountries.eu/data/prk.svg",
        "regionalBlocs": [],
        "cioc": "PRK"
    },
    {
        "name": "United Kingdom of Great Britain and Northern Ireland",
        "topLevelDomain": [
            ".uk"
        ],
        "alpha2Code": "GB",
        "alpha3Code": "GBR",
        "callingCodes": [
            "44"
        ],
        "capital": "London",
        "altSpellings": [
            "GB",
            "UK",
            "Great Britain"
        ],
        "region": "Europe",
        "subregion": "Northern Europe",
        "population": 65110000,
        "latlng": [
            54.0,
            -2.0
        ],
        "demonym": "British",
        "area": 242900.0,
        "gini": 34.0,
        "timezones": [
            "UTC-08:00",
            "UTC-05:00",
            "UTC-04:00",
            "UTC-03:00",
            "UTC-02:00",
            "UTC",
            "UTC+01:00",
            "UTC+02:00",
            "UTC+06:00"
        ],
        "borders": [
            "IRL"
        ],
        "nativeName": "United Kingdom",
        "numericCode": "826",
        "currencies": [
            {
                "code": "GBP",
                "name": "British pound",
                "symbol": "£"
            }
        ],
        "languages": [
            {
                "iso639_1": "en",
                "iso639_2": "eng",
                "name": "English",
                "nativeName": "English"
            }
        ],
        "translations": {
            "de": "Vereinigtes Königreich",
            "es": "Reino Unido",
            "fr": "Royaume-Uni",
            "ja": "イギリス",
            "it": "Regno Unito",
            "br": "Reino Unido",
            "pt": "Reino Unido",
            "nl": "Verenigd Koninkrijk",
            "hr": "Ujedinjeno Kraljevstvo",
            "fa": "بریتانیای کبیر و ایرلند شمالی"
        },
        "flag": "https://restcountries.eu/data/gbr.svg",
        "regionalBlocs": [
            {
                "acronym": "EU",
                "name": "European Union",
                "otherAcronyms": [],
                "otherNames": []
            }
        ],
        "cioc": "GBR"
    }
]

     */



    //https://restcountries.eu/rest/v2/name/{name}
    @GET("https://restcountries.eu/rest/")
    Observable<CountryResponse> getCountires(@Query("name") String name);
}