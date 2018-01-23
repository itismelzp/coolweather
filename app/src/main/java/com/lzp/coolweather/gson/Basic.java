package com.lzp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lizhiping03 on 2018/1/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
