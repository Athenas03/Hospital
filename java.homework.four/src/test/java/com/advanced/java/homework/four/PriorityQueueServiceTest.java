package com.advanced.java.homework.four;
import com.advanced.java.homework.four.objects.Person;
import com.advanced.java.homework.four.services.PriorityQueueService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PriorityQueueServiceTest {

    private PriorityQueueService priorityQueueService;

    @BeforeEach
    public void setUp() {

        priorityQueueService = new PriorityQueueService();


    }

    @Test
    public void createPriorityQueue() {
        priorityQueueService.createPriorityQueue();
        assertNotNull(priorityQueueService.getPriorityQueue());

    }


    @Test
    void addToPriorityQueue() {

        Person person1 = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        Person person2 = new Person("Salman", "Athena", "111 st", "Dearborn", "MI", "12345");
        priorityQueueService.addToPriorityQueue(person1);
        priorityQueueService.addToPriorityQueue(person2);



        PriorityQueue<Person> priorityQueue = priorityQueueService.getPriorityQueue();
        assertEquals(person1, priorityQueue.poll());
        assertEquals(person2, priorityQueue.poll());
    }



    @Test
    public void removeFromPriorityQueue() {
        priorityQueueService.createPriorityQueue();
        Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        priorityQueueService.addToPriorityQueue(person);

        Person removedPerson =priorityQueueService.removeFromPriorityQueue();
        assertEquals(person,removedPerson);

    }


    @Test
    public void getPriorityQueue() {
        priorityQueueService.createPriorityQueue();
        assertNotNull(priorityQueueService.getPriorityQueue());
    }


    @Test
    public void clearPriorityQueue(){
        priorityQueueService.createPriorityQueue();
        Person person= new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        priorityQueueService.addToPriorityQueue(person);
        assertFalse(priorityQueueService.getPriorityQueue().isEmpty());

        priorityQueueService.clearPriorityQueue();
        assertTrue(priorityQueueService.getPriorityQueue().isEmpty());


    }



}


