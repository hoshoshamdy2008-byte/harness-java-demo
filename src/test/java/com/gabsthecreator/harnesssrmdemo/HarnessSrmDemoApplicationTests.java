package com.gabsthecreator.harnesssrmdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HarnessSrmDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void shouldReturnDefaultMessage() throws Exception {
        // This tests if the root URL "/" returns a 200 OK status
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

}
