package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.MyController;

@SpringBootTest
public class MyControllerTest {

	  public static Logger logger=	LoggerFactory.getLogger("MyController");

    @Autowired
    private MyController myController;

    @Test
    public void testMessage() {
        String expected = "helloHai!!!!!!";  // Correct expected value
        
        logger.info(";;;;;;;;;;;;;;;;;"+expected);
        String actual = myController.Message();

        assertEquals(expected, actual);  // This should pass now
    }
}
