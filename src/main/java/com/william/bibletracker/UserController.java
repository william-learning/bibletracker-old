package com.william.bibletracker;

import com.william.bibletracker.entity.User;
import com.william.bibletracker.repository.BibleRepository;
import com.william.bibletracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    BibleRepository bibleRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String createUser() {

        User user = new User("William");
        userRepository.save(user);

        List<User> allUsers = userRepository.findAll();
        System.out.println("All users: " + allUsers);

        return String.valueOf(user.getId());
    }

    @GetMapping(value = "/getBible")
    public String getBible() {
        return String.valueOf(bibleRepository.findAll());
    }
}
