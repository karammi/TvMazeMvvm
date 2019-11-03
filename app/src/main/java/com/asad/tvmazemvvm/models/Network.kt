package com.asad.tvmazemvvm.models

data class Network (
    var id:Int,
    var name:String,
    var country: Country
)

data class Country(
    var name:String,
    var code:String,
    var timezone:String
)

/*
*  "network": {
        "id": 2,
        "name": "CBS",
        "country": {
            "name": "United States",
            "code": "US",
            "timezone": "America/New_York"
        }
    }*/