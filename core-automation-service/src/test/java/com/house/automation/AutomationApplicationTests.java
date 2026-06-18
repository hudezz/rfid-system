package com.house.automation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.house.automation.model.TagRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class
AutomationApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testTriggerEndpoint() throws Exception {
        TagRequest request = new TagRequest("test-tag-id", "test-scanner");

        mockMvc.perform(post("/api/v1/automation/trigger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().string("Tag detected, but no rules are coded for test-tag-id yet!"));
    }

    @Test
    void testWashingMachineTag() throws Exception {
        TagRequest request = new TagRequest("washingmachine-tag", "Roommate1");

        mockMvc.perform(post("/api/v1/automation/trigger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().string("Good job keeping up with the laundry, Roommate1!"));
    }

    @Test
    void testCatsFedTag() throws Exception {
        TagRequest request = new TagRequest("CatsFedandLittercleaned-tag", "Roommate2");

        mockMvc.perform(post("/api/v1/automation/trigger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().string("Good boy, keep feeding the cats! Miau miau, Roommate2"));
    }

    @Test
    void testTrashOutTag() throws Exception {
        TagRequest request = new TagRequest("trashOut-tag", "Roommate3");

        mockMvc.perform(post("/api/v1/automation/trigger")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().string("Good boy, keeping the garbage out, Roommate3!"));
    }
}
