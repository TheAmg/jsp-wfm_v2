package com.jsp.jspwfm.Controllers;

import com.google.gson.JsonElement;
import com.jsp.jspwfm.Models.Entities.WeatherInfo;
import com.jsp.jspwfm.ThirdPartyService;
import org.apache.tomcat.util.json.ParseException;
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
    public ResponseEntity<String> getResponse(@RequestParam String location) {
        return ResponseEntity.ok(thirdPartyService.getWeatherFor(location));

    }
}
