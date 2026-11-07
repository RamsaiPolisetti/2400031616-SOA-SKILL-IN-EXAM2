package com.example.ms1.controller;

import com.example.ms1.service.MS1Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MS1Controller.class)
class MS1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MS1Service ms1Service;

    @Test
    void add_returnsOkAndExpectedMessage() throws Exception {
        given(ms1Service.add(5, 10)).willReturn(15);

        mockMvc.perform(get("/ms1/add")
                        .param("a", "5")
                        .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 15"));
    }
}
