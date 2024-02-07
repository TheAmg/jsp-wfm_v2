package com.jsp.wfm.Services;

import com.jsp.wfm.Dao.UsersRepository;
import com.jsp.wfm.Models.Entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User getUserProfile(String username) {
        User u = usersRepository.getUserByUsername(username);
        u.setPassword("temp-pass");
        return u;
    }
}
