package com.rohit.atal.Library.service;

import com.rohit.atal.Library.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    List<User> Userlist = new ArrayList<>();
    public UserServiceImpl(List<User> userList){
        Userlist = userList;
        userList.add(new User(13,"rohit"));
    }
    @Override
    public List<User> getAllUsers() {
        return Userlist;
    }

    @Override
    public Optional<User> getUserById(int Userid){
        Optional<User> user = Optional.empty();
        for(User obj : Userlist) {
            if(obj.getUserid() == Userid){
                user = Optional.of(obj);
                break;
            }
        }
        return user;
    }

    @Override
    public User createUser(User user) {
        Userlist.add(user);
        return user;
    }

    @Override
    public void updateUser(int Userid, User updatedUser){
        try {
            for (User obj : Userlist) {
                if (obj.getUserid() == Userid) {
                    obj.setUsername(updatedUser.getUsername());
                    break;
                }
            }
        } catch (Exception ignored) {
        }
    }

    @Override
    public void deleteUser(Long Userid) {
        Userlist.removeIf(obj -> obj.getUserid() == Userid);
    }
}
