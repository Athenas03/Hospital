package com.advanced.java.homework.four;

import com.advanced.java.homework.four.objects.Person;
import com.advanced.java.homework.four.services.MapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MapServiceTest {

    private MapService mapService;

    @BeforeEach
    public void setUp() {

        mapService=new MapService();


    }
    @Test
    public void createHashMap(){
        mapService.createHashMap();
        assertNotNull(mapService.getHashMap());

    }
    @Test
    public void addToHashMap(){
        mapService.createHashMap();
        Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        String socialSecurityNum="111-11-1111";
        mapService.addToHashMap(socialSecurityNum,person);
        HashMap<String,Person> personHashMap =mapService.getHashMap();
        assertTrue(personHashMap.containsKey(socialSecurityNum));
        assertEquals(person,personHashMap.get(socialSecurityNum));

    }


    @Test
    public void getHashMap(){
    mapService.createHashMap();
    assertNotNull(mapService.getHashMap());



    }
    @Test
    public void clearHashMap(){
    Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        mapService.createHashMap();
        mapService.addToHashMap("key", person);
        HashMap<String, Person> hashMap = mapService.getHashMap();
        assertNotNull(hashMap);
        assertEquals(1, hashMap.size());
        mapService.clearHashMap();
        assertEquals(0, hashMap.size());



    }

}
