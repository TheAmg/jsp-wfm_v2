package com.jsp.jspwfm;

import com.google.gson.JsonElement;
import com.jsp.jspwfm.Models.Entities.WeatherInfo;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ThirdPartyService {

    ThirdPartyApiHelper helper = new ThirdPartyApiHelper();
    public String getWeatherFor(String location) {
        return helper.getWeatherinfo(location);
    }
}
