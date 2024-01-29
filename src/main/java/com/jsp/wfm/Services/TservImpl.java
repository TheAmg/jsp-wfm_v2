package com.jsp.wfm.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
@Slf4j
public class TservImpl implements TserveI {

    @Override
    public int doSomething() {
        return 10;
    }
}
