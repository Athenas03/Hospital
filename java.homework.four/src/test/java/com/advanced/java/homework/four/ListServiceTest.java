package com.advanced.java.homework.four;

import com.advanced.java.homework.four.objects.Person;
import com.advanced.java.homework.four.services.ListService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Provider;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ListServiceTest {

        private ListService listService;
    @BeforeEach
    public void setUp() {
        listService  = new ListService();
    }

    @Test
    public void testCreateStringList(){
        listService.createStringList();
        assertNotNull(listService.getStringList());
        assertEquals(0, listService.getStringList().size());

    }

    @Test
    public void testCreatePersonList(){
        listService.createPersonList();
        assertNotNull(listService.getPersonList());
        assertEquals(0, listService.getPersonList().size());

    }

    @Test
    public void testAddToStringList() {
        listService.createStringList();
        listService.addToStringList("Test String");
        assertEquals(1, listService.getStringList().size());
        assertEquals("Test String", listService.getStringList().get(0));
    }


    @Test
    public void testAddToPersonList() {
        Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        listService.addToPersonList(person);
        List<Person> personList = listService.getPersonList();
        assertEquals(1, personList.size());
        assertEquals(person, personList.get(0));
    }

    @Test
    public void testClearStringList() {
        listService.createStringList();
        listService.addToStringList("Test String");
        listService.clearStringList();
        assertEquals(0, listService.getStringList().size());
    }


    @Test
    public void testClearPersonList() {
        Person person = new Person("Athena", "Salman", "111 st", "Dearborn", "MI", "12345");
        listService.addToPersonList(person);
        listService.clearPersonList();
        List<Person> personList = listService.getPersonList();
        assertEquals(0, personList.size());
    }

}
