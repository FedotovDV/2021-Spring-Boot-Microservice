package ru.fed3375546.userservice;

import ru.fed3375546.model.request.UserDetailsRequestModel;
import ru.fed3375546.model.response.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);
}
