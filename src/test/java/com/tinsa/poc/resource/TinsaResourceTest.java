

package com.tinsa.poc.resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

// TODO: Auto-generated Javadoc
/**
 * The Class TinsaResourceTest.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TinsaResource.class)

public class TinsaResourceTest {
	
	/** The mock mvc. */
	@Autowired
    private MockMvc mockMvc;
	
	
	/**
	 * Test notificar.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testNotificar() throws Exception{
		
//		this.mockMvc.perform(get("/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType("application/json"));	
	}
}


