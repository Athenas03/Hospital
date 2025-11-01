package com.advanced.java.homework.four;

import com.advanced.java.homework.four.objects.Person;
import com.advanced.java.homework.four.services.HashSetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HashSetServiceTest {

    private HashSetService hashSetService;

    @BeforeEach
    public void setUp() {
        hashSetService= new HashSetService();
    }
    @Test
    public void createHashSet(){
        hashSetService.createHashSet();
        assertNotNull(hashSetService.getHashSet());
    }

    @Test
    public void addToHashSet(){
    hashSetService.createHashSet();
    Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
    hashSetService.addToHashSet(person);
    HashSet<Person> personHashSet =hashSetService.getHashSet();
    assertTrue(personHashSet.contains(person));

    }



    @Test
    public void getHashSet(){
        hashSetService.createHashSet();
        HashSet<Person> hashSet=hashSetService.getHashSet();
        assertNotNull(hashSet);
        assertEquals(0,hashSet.size());
    }

    @Test
    public void clearHashSet(){
        hashSetService.createHashSet();
        Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
         hashSetService.addToHashSet(person);
         assertFalse(hashSetService.getHashSet().isEmpty());
        hashSetService.clearHashSet();
        assertTrue(hashSetService.getHashSet().isEmpty());

}

}
