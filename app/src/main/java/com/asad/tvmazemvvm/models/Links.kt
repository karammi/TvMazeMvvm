package com.asad.tvmazemvvm.models

import android.provider.Settings

data class Links(
    var self:Link,
    var previousepisode:Link
)

data class Link(
    var href: String
)


/*
*  "_links": {
        "self": {
            "href": "http://api.tvmaze.com/shows/1"
        },
        "previousepisode": {
            "href": "http://api.tvmaze.com/episodes/185054"
        }
    }*/