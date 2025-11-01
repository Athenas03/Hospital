package com.advanced.java.homework.four.services;

import com.advanced.java.homework.four.objects.Person;
import org.springframework.stereotype.Service;


import java.util.HashSet;

@Service
public class HashSetService {
   private HashSet <Person> personHashSet;

   public void createHashSet(){
       personHashSet= new HashSet<>();

   }
   public void addToHashSet(Person person){
       personHashSet.add(person);

   }

    public HashSet<Person> getHashSet(){
       return personHashSet;
    }

    public void clearHashSet(){
       personHashSet.clear();
    }



}
