package com.thetechbologs.unittestingspringboot;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureHttpGraphQlTester;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//@SpringBootTest
public class SmokeTest {

    @Test
    void contextLoads() {
    }


    @Mock
    private HomeController controller;

    private MockMvc mockMvc;

    @Mock
    private WebApplicationContext context;

    @Mock
    private RestTemplate restTemplate;


    @Test
    private void setup(){
        System.out.println("Inside setup");
        assertThat(this.restTemplate.getForObject("http://localhost:8080/",String.class).concat("Hello World"));
    }

    @Test
    private void contextLoad() throws Exception {
        System.out.println("Inside context Load ###");
        assertThat(controller).isNull();
    }
}
