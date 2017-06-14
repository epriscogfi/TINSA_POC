

package com.tinsa.poc.resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TinsaResource.class)

public class TinsaResourceTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	
	@Test
	public void testNotificar() throws Exception{
		
//		this.mockMvc.perform(get("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType("application/json"));	
	}
}


