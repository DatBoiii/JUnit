package com.example.testingweb;

import java.beans.Transient;

import org.springframework.beans.factory.annotation.Autowired;

@WebMvcTest
public class WebLayerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World")));
	}
}
