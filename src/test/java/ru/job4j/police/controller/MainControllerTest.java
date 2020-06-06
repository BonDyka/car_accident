package ru.job4j.police.controller;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import ru.job4j.police.Application;
import ru.job4j.police.domain.Accident;
import ru.job4j.police.service.AccidentService;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
class MainControllerTest {
    @MockBean
    AccidentService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser
    public void whenAskMainPageShouldReturnMainPage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("main"));
    }

    @Test
    @WithMockUser
    public void whenAddNewAccidentShouldAddItAndRedirectOnMainPage() throws Exception {
        this.mockMvc.perform(post("/")
                    .param("name", "Accident Name")
                    .param("text", "Accident desc")
                    .param("address", "Accident Address")
                    .with(csrf()))
                .andExpect(status().is3xxRedirection());
        ArgumentCaptor<Accident> argument = ArgumentCaptor.forClass(Accident.class);
        verify(service).save(argument.capture());
        assertThat(argument.getValue().getName(), is("Accident Name"));
        assertThat(argument.getValue().getText(), is("Accident desc"));
        assertThat(argument.getValue().getAddress(), is("Accident Address"));
    }
}