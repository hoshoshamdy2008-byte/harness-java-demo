package com.gabsthecreator.harnesssrmdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

// THESE ARE THE MISSING IMPORTS CAUSING THE ERROR:
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HarnessSrmDemoApplicationTests {

    @Autowired
    private MockMvc mockMvc; // This solves the "cannot find symbol: variable mockMvc"

    @Test
    void contextLoads() {
    }

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        // The imports above allow you to use get() and status()
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }
}
