package com.udemy.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 4;

    static
    {
        users.add(new User(1, "duygu", new Date()));
        users.add(new User(2, "ali", new Date()));
        users.add(new User(3, "jack", new Date()));
        users.add(new User(4, "mel", new Date()));


    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null)
           user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(Integer id){
        for (User user : users) {
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    public User deleteById(Integer id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if (user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
