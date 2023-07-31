package com.jsp.jspwfm.Services;

import org.springframework.stereotype.Component;

@Component
public class CustomServiceImpl implements CustomService{
    @Override
    public String getValue() {
        return "Some Value1";
    }
}
