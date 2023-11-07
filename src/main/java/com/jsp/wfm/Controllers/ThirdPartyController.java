package com.jsp.wfm.Controllers;

import com.jsp.wfm.Models.Entities.WeatherInfo;
import com.jsp.wfm.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tpc")
public class ThirdPartyController {

    @Autowired
    ThirdPartyService thirdPartyService;
    @RequestMapping(value ="/weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WeatherInfo> getResponse(@RequestParam String location) throws Exception {
        WeatherInfo info = thirdPartyService.getWeatherFor(location);
        return ResponseEntity.ok(info);

    }

    @RequestMapping(value ="/weather/bangalore", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WeatherInfo> getWeatherForBangalore() throws Exception
    {
        return ResponseEntity.ok(thirdPartyService.getWeatherFor("Bangalore"));
    }
}
