package com.mobius.example.services;

import com.mobius.example.TestModuleConfiguration;
import com.mobius.example.services.SimpleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestModuleConfiguration.class)
public class SimpleServiceTest {

    @Autowired
    SimpleService simpleService;

    @Test public void doWork() throws Exception {
        assertThat("Service should work", simpleService.doWork(), is("Work is done!"));
    }
}