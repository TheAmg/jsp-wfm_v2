package com.jsp.wfm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsp.wfm.Models.Entities.WeatherInfo;

public class SerializationUtils {

    public static WeatherInfo getObjectFor(String info) throws Exception {
        ObjectMapper om = new ObjectMapper();
        WeatherInfo weatherInfo = om.readValue(info, WeatherInfo.class);
        return weatherInfo;
    }
}
