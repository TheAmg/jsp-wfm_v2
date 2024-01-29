package com.jsp.wfm.Services;

import com.jsp.wfm.Dao.UsersRepository;
import com.jsp.wfm.Models.Entities.User;
import com.jsp.wfm.Models.Entities.UserListInfo;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public User getUser(String username) {
        User u = usersRepository.getUserByUsername(username);
        return u;
    }

    public Optional<User> getOpUser(String username) {
//        User user = new User();
//        user.setUser_id(1);
//        user.setUsername("username");
//        user.setEmail("user@gmail.com");
//        user.setPassword("upass");
        return usersRepository.getOptionalUser(username);
    }

    public Optional<User> findUserById(long id) {
        return usersRepository.findById(id);
    }

    public void addUser(User user) {
        usersRepository.save(user);
    }

    public String throwExceptionTest() {
        String a = "aaa ccc";
        String s = "a".split(" ")[1];
        return a;
    }

    public String many(String a, String b, String c, String d) {
        return "some1";
    }

    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    public UserListInfo getULO() {
        return new UserListInfo(0, usersRepository.findAll());
    }

    public int getNumber() {
        return 14;
    }

    public Instant getInstantJavaTime() {
        return Instant.now();
    }

    public org.joda.time.Instant getJodaInstant() {
        return org.joda.time.Instant.now();
    }

    public DateTime getJodaDateTime() {
        return DateTime.now();
    }
}

//-javaagent:"/Users/testerfresher/.videobug/videobug-java-agent.jar=i=com.jsp.jspwfm" --add-opens=java.base/java.util=ALL-UNNAMED

