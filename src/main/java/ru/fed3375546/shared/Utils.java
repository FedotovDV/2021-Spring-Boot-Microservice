package ru.fed3375546.shared;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Utils {
    public String generateUserId(){
        return UUID.randomUUID().toString();
    }

}
