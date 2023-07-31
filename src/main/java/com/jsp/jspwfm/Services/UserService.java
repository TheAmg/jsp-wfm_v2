package com.jsp.jspwfm.Services;

import com.jsp.jspwfm.Dao.UsersRepository;
import com.jsp.jspwfm.Models.Entities.User;
import com.jsp.jspwfm.Models.Entities.UserListInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {

    @Autowired
    UsersRepository usersRepository;
    public User getUser(String username)
    {
        User u =  usersRepository.getUserByUsername(username);
        u.setUsername("Something else");
        return u;
    }

    public void addUser(User user)
    {
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
        return new UserListInfo(0,usersRepository.findAll());
    }
}

//-javaagent:"/Users/testerfresher/.videobug/videobug-java-agent.jar=i=com.jsp.jspwfm" --add-opens=java.base/java.util=ALL-UNNAMED
