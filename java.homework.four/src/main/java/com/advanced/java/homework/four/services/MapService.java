package com.advanced.java.homework.four.services;

import com.advanced.java.homework.four.objects.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MapService {

private HashMap<String, Person> hashMap;

public void createHashMap(){
    hashMap = new HashMap<>();
}

    public void addToHashMap(String socialSecurityNum,Person person){
    hashMap.put(socialSecurityNum, person);

    }
    public HashMap<String,Person> getHashMap(){
    return hashMap;
    }

    public void clearHashMap(){
    hashMap.clear();
    }


}
