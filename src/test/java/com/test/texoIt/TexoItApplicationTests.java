package com.test.texoIt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class TexoItApplicationTests {

	private static final String RESPONSE_BODY = "{\"min\":[{\"producer\":\"Bo Derek\",\"interval\":6,\"previousWin\":1984,\"followingWin\":1990}],\"max\":[{\"producer\":\"Bo Derek\",\"interval\":6,\"previousWin\":1984,\"followingWin\":1990}]}";

	@Autowired
	private MockMvc mockMvc;


	@Test
	void contextLoads() {
	}

	@Test
	void testAwardsIntervalEndpoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/awardsInterval"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(RESPONSE_BODY));
	}
}
