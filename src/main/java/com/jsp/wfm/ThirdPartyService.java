package com.jsp.wfm;

import com.jsp.wfm.Models.Entities.WeatherInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ThirdPartyService {
    ThirdPartyApiHelper helper = new ThirdPartyApiHelper();
    public WeatherInfo getWeatherFor(String location) throws Exception {
        String info = helper.getWeatherinfo(location);
        return SerializationUtils.getObjectFor(info);
    }
}
