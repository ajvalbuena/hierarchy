package com.packlink.hierachy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeIT {
    @Autowired
    private MockMvc mvc;

    @Test
    public void emptyEmployeeHierarchy() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.post("/hierarchy").content("{}").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{}"));
    }

    @Test
    public void oneEmployeeWithSupervisor() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.post("/hierarchy").content("{\"Pete\":\"Barbara\"}").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"Barbara\":{\"Pete\": {}}}"));
    }
}
