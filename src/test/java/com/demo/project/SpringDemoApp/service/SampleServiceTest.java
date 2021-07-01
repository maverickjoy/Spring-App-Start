package com.demo.project.SpringDemoApp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SampleServiceTest {

    @Mock
    private RestTemplate mockRestTemplate;

    @InjectMocks
    private SampleService sampleServiceUnderTest;

    @Test
    void testGetServiceName() {
        // Setup

        // Run the test
        final String result = sampleServiceUnderTest.getServiceName();

        // Verify the results
        assertEquals("Spring Demo App", result);
    }

    @Test
    void testGetUserNameById() {
        // Setup

        // Run the test
        final String result = sampleServiceUnderTest.getUserNameById(0);

        // Verify the results
        assertEquals("Id not present", result);
    }

    @Test
    void testGetIdWithException() {
        // Setup

        // Run the test
        final int result = sampleServiceUnderTest.getIdWithException(0);

        // Verify the results
        assertEquals(0, result);
    }
}
