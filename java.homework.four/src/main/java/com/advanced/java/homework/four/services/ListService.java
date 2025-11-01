package com.advanced.java.homework.four.services;

import com.advanced.java.homework.four.objects.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListService {

    private List<String> stringList;
   private List <Person> personList;

   public ListService() {
       stringList = new ArrayList<>();
       personList = new ArrayList<>();

   }
   public void createStringList(){
       stringList = new ArrayList<>();

   }
   public void createPersonList(){
       personList = new ArrayList<>();
   }

    public void addToStringList(String item){
       stringList.add(item);
    }

    public void addToPersonList(Person person){
       personList.add(person);
    }

    public List<String> getStringList(){
       return stringList;
    }

    public List<Person> getPersonList(){
       return personList;
    }

    public void clearStringList(){
       stringList.clear();

    }
    public void clearPersonList(){
       personList.clear();
    }



}
