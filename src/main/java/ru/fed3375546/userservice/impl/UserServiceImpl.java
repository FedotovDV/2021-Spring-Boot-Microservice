package ru.fed3375546.userservice.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fed3375546.model.request.UserDetailsRequestModel;
import ru.fed3375546.model.response.UserRest;
import ru.fed3375546.shared.Utils;
import ru.fed3375546.userservice.UserService;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    @Autowired
    public UserServiceImpl(Utils utils){
        this.utils = utils;
    }


    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);

        if (users == null) {
            users = new HashMap<>();
        }
        users.put(userId, returnValue);
        return returnValue;
    }
}
