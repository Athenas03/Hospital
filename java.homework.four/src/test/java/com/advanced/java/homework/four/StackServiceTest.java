package com.advanced.java.homework.four;

import com.advanced.java.homework.four.services.StackService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StackServiceTest {

    private StackService stackService ;
    @BeforeEach
    public void setUp() {

        stackService = new StackService();

    }
    @Test
    public void createStack(){
        stackService.createStack();
        assertTrue(stackService.getStack().isEmpty());

    }
    @Test
    public void addToStack(){
        stackService.addToStack(5.0);
        assertFalse(stackService.getStack().isEmpty());
        assertEquals(5.0,stackService.getStack().peek());
    }

    @Test
    public void getStack(){
        stackService.addToStack(3.0);
        stackService.addToStack(7.0);
        assertEquals(2,stackService.getStack().size());
    }



}
