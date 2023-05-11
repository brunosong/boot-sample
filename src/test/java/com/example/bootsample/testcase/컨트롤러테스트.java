package com.example.bootsample.testcase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.FileInputStream;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class 컨트롤러테스트 {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        //this.mockMvc = MockMvcBuilders.standaloneSetup(new MetaBulkLevelController()).build();  //컨트롤러만 지정해서 확인 가능
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();           //실제 밖에서 들어온것 처럼 인터셉터 필터도 다 작동한다.
    }

    @Test
    public void homeTest() throws Exception {
        MockMultipartFile
                file = new MockMultipartFile("bulkFile",
                "test.png",
                "image/png",
                new FileInputStream("C:\\DEV\\EXCEL_TEMP\\AI학교시험_56학년2학기_전체목차_230320.xlsx"));

        mockMvc.perform(
                multipart("/metaBulkLevelUpload")
                        .file(file)
                        .param("name", "testBrunosong")
        ).andExpect(status().isOk());

    }

}
