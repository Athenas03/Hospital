package com.advanced.java.homework.four.services;

import com.advanced.java.homework.four.objects.Person;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

@Service
public class PriorityQueueService {


    private PriorityQueue<Person> priorityQueue;

    public void createPriorityQueue(){
        priorityQueue =new PriorityQueue<>();
    }

    public void addToPriorityQueue(Person person){
        priorityQueue.add(person);

    }
    public Person removeFromPriorityQueue(){
        return priorityQueue.poll();
    }

    public PriorityQueue<Person> getPriorityQueue(){
        return priorityQueue;
    }

    public void clearPriorityQueue(){
        priorityQueue.clear();

    }



}


