package com.jsp.jspwfm.Controllers;

import com.jsp.jspwfm.Models.Entities.User;
import com.jsp.jspwfm.Models.Entities.UserListInfo;
import com.jsp.jspwfm.Models.Entities.pojo;
import com.jsp.jspwfm.Services.CustomService;
import com.jsp.jspwfm.Services.UserService;
import com.jsp.jspwfm.UserInstanceService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CustomService customService;
    private UserInstanceService userInstanceService = new UserInstanceService();
    @RequestMapping("/getUser")
    public User testFetchUser(@RequestParam String username)
    {
         User u =  userService.getUser(username);
         u.setUsername("BBB");
         someMethod(u,u.getUsername(),u.getPassword(),u.getUser_id()+"",u.getEmail());
         return u;
    }

    @RequestMapping("/saveUser")
    public ResponseEntity saveUser(@RequestParam String username,
                                   @RequestParam String password, @RequestParam String email)
    {
        return ResponseEntity.ok(userInstanceService.saveUser(username,password,email));
    }

    @RequestMapping("/fetchById")
    public ResponseEntity saveUser(@RequestParam int id)
    {
        return ResponseEntity.ok("Sus");
        //sometingii
    }

    @PostMapping("/test")
    public String getTestText()
    {
        return customService.getValue();
    }

    @GetMapping("/instant")
    public Instant getInstant()
    {
//        return userService.throwExceptionTest();
        Instant inst1 = Instant.parse("2021-02-09T11:19:42.xan");
        return inst1;
    }

    @GetMapping("/joda")
    public DateTime jodatest()
    {
        String rs;
//        return userService.throwExceptionTest();
        DateTime time = new DateTime();
        return time;
    }

    @RequestMapping("/testPojo")
    public Object getTestPojo()
    {
//        return userService.throwExceptionTest();
        String b ="A";
        pojo res = pojo.builder().name("test pot").build();
        System.out.println(res.getId());
        System.out.println("long : "+res.getx());
        return res;
    }

    @RequestMapping("/many")
    public String a()
    {
        return userService.many("a","b","c","d");
    }

    @RequestMapping("/bool")
    public boolean getBool()
    {
        return false;

    }

    void restMethod(User user, User u2)
    {
        String e= "a".split(" ")[10];
    }

    public String methodA(String a)
    {
        return a+"12";
    }

    public String methodIntTest(int id)
    {
        int x = 6;
        return "OBJECTb_"+id;
    }

    public void testEE()
    {
        System.out.println("E");
    }

    public void addUser(User user)
    {
        userService.addUser(user);
    }

    public double d(double a, double b)
    {
        return a+b;
    }

    public Float f(Float a, Float b)
    {
        Float res = a+b;
        return res;
    }

    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    public UserListInfo getULI()
    {
        return userService.getULO();
    }

    public void someMethod(User u, String username, String pass, String id, String email)
    {

    }
}

