package com.stackroute.activitystream.test;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.activitystream.calculator.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ApplicationTest {

   @Autowired
   UserRepository userRepository;
	@Test
    public void contextLoads() throws Exception {
		assertNotNull(userRepository.findOne((long) 1));
    }

}